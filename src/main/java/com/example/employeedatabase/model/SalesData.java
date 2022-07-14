package com.example.employeedatabase.model;

public class SalesData {

	private String employeeName;
	private String sex;
	private String clientName;
	private Integer totalSales;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Integer getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(Integer totalSales) {
		this.totalSales = totalSales;
	}
	@Override
	public String toString() {
		return "SalesData [employeeName=" + employeeName + ", sex=" + sex + ", clientName=" + clientName
				+ ", totalSales=" + totalSales + "]";
	}
	
	
}
