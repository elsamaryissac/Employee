package com.example.employeedatabase.database.common;

import java.util.List;
import java.util.stream.Collectors;

import com.example.employeedatabase.model.SalesData;

public class DataTransformer {

	public static List<SalesData> getSalesData(List<Object[]> objectList) {
		List<SalesData> salesList = objectList.stream().map(obj-> getSalesData(obj)).collect(Collectors.toList());
										
		return salesList;
	}
	
	private static SalesData getSalesData(Object[] data) {
		SalesData salesData = new SalesData();
		String employeeFirstName = data[1] == null ? "" : (String)data[1]; 
		salesData.setEmployeeName(employeeFirstName+" "+data[2]);
		salesData.setClientName((String)data[4]);
		salesData.setSex((String)data[3]);
		salesData.setTotalSales((Integer)data[0]);
		return salesData;
	}
}
