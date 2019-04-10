package com.bank.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Log4j2
@ControllerAdvice
public class BankBranchesExceptionHandler {

    @ExceptionHandler(value = BankBranchesException.class)
    @ResponseBody
    public ResponseEntity<?> handleBankBranchesException(BankBranchesException exception) {
        log.error(buildStackTraceForLogging(exception.getStackTrace()));
        return ResponseEntity.status(exception.getHttpStatus()).body(exception.getExceptionData());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<?> handleGenericException(Exception exception) {
        log.error(buildStackTraceForLogging(exception.getStackTrace()));
        return ResponseEntity.badRequest().body(ErrorConstant.GENERIC_ERROR);
    }

    private String buildStackTraceForLogging(StackTraceElement[] elements){
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(elements).forEach(stackTraceElement -> stringBuilder.append(stackTraceElement.toString()));
        return stringBuilder.toString();
    }
}
