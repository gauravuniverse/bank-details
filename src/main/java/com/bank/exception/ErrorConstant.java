package com.bank.exception;

public interface ErrorConstant {
    ExceptionData GENERIC_ERROR = new ExceptionData("GENERIC_ERROR","Something went wrong");
    ExceptionData FAILED_TO_GET_DATA = new ExceptionData("FAILED_TO_GET_DATA","Failed to get data");
}
