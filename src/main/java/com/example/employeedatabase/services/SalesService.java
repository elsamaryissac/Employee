package com.example.employeedatabase.services;

import java.util.List;

import com.example.employeedatabase.model.SalesData;
import com.example.employeedatabase.database.entity.Employee;
import com.example.employeedatabase.database.entity.WorksWith;


public interface SalesService {

	public List<Employee> getEmployeeList();
	public List<SalesData> getSalesData(List<String> companyList, String sex) throws Exception;
}
