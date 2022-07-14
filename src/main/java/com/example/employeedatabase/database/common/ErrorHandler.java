package com.example.employeedatabase.database.common;

import com.example.employeedatabase.response.GenericResponse;

public class ErrorHandler {

	public static void setInvalidRequest(GenericResponse response) {
		setError(response, ErrorConstants.MISSING_CODE, ErrorConstants.MISSING_MESSGAE);
	}
	
	public static void setNoDataFound(GenericResponse response) {
		setError(response, ErrorConstants.DATA_MISSING_CODE, ErrorConstants.DATA_MISSING_MESSGAE);
	}
	
	public static void setGenericError(GenericResponse response) {
		setError(response, ErrorConstants.GENERIC_ERROR_CODE, ErrorConstants.GENERIC_ERROR_MESSGAE);
	}
	
	public static void setError(GenericResponse respose, String errorCode, String errorMessgae) {
		respose.setErrorCode(errorCode);
		respose.setErrorMessage(errorMessgae);
	}
}
