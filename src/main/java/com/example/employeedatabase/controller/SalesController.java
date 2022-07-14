package com.example.employeedatabase.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeedatabase.model.SalesData;
import com.example.employeedatabase.response.GenericResponse;
import com.example.employeedatabase.response.SalesDataResponse;
import com.example.employeedatabase.services.SalesService;

import static com.example.employeedatabase.database.common.ErrorHandler.*;

@RestController
@RequestMapping(value = "service/sales", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

public class SalesController {


	private static final Logger LOGGER = LoggerFactory.getLogger(SalesController.class);
	
	@Autowired
	private SalesService salesService;
	
	@GetMapping("/getdata")
	public ResponseEntity<?> getSales(@RequestParam(required = true) List<String> values){
		LOGGER.info("Get all sales records {}", values);
		SalesDataResponse response = new SalesDataResponse();
		HttpStatus status = HttpStatus.OK;
		try {
			if (values.isEmpty()) {
				setInvalidClientList(response);
			} else {
				List<SalesData> salesDataList = salesService.getSalesData(values);
				if (salesDataList.isEmpty()) {
					setNoDataFound(response);
				} else {
					response.setData(salesDataList);
				}
			}
		} catch (Exception e) {
			LOGGER.error("Error occured ", e);
			setGenericError(response);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<SalesDataResponse>(response, status);
		
}
}
