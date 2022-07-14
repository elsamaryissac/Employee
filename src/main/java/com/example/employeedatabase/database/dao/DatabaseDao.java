package com.example.employeedatabase.database.dao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Component;

import com.example.employeedatabase.database.common.DataTransformer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DatabaseDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseDao.class);
	@PersistenceContext
	private EntityManager entityManager;

	public List<Object[]> getSalesData(List<String> companyList) throws Exception {
		List<Object[]> result = null;
		try {
			String query = "SELECT ww.total_sales,emp.first_name,emp.last_name,emp.sex,cli.client_name"
					+ " FROM works_with ww"
					+ " LEFT JOIN employee emp on (emp.emp_id=ww.emp_id)"
					+ " LEFT JOIN client cli on (cli.client_id=ww.client_id)"
					+ " WHERE cli.client_name in :clients"
					+ " AND emp.sex='M'";
			Query jpqlQuery = entityManager.createNativeQuery(query);
			jpqlQuery.setParameter("clients", companyList);
			result = jpqlQuery.getResultList();
		} catch (Exception e) {
			LOGGER.error("Issue occured while connecting with DB", e);
			throw e;
		}
	    return result;
	}
}
