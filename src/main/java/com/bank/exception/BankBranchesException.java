package com.bank.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class BankBranchesException extends Exception {
    @NonNull
    private ExceptionData exceptionData;
    private HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
}
