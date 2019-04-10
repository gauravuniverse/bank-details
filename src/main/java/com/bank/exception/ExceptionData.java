package com.bank.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ExceptionData {
    private String errorKey;
    private String errorMessage;
}
