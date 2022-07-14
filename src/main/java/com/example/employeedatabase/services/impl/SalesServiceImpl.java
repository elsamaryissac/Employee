package com.example.employeedatabase.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeedatabase.database.common.DataTransformer;
import com.example.employeedatabase.database.dao.DatabaseDao;
import com.example.employeedatabase.database.entity.Employee;
import com.example.employeedatabase.database.repository.EmployeeRepository;
import com.example.employeedatabase.model.SalesData;
import com.example.employeedatabase.services.SalesService;

@Service
public class SalesServiceImpl implements SalesService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	private DatabaseDao databaseDao;
	
	@Override
	public List<Employee> getEmployeeList() {
		return employeeRepository.findAll();
	}

	@Override
	public List<SalesData> getSalesData(List<String> companyList) throws Exception {
		return DataTransformer.getSalesData(databaseDao.getSalesData(companyList));
	}

}
