package com.example.employeedatabase.response;

import java.util.List;

import com.example.employeedatabase.model.SalesData;

public class SalesDataResponse extends GenericResponse {

	private List<SalesData> data;

	public List<SalesData> getData() {
		return data;
	}

	public void setData(List<SalesData> data) {
		this.data = data;
	}

}
