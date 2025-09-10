package com.example.aibyhhhhhhjs.controller.exception;

import lombok.Getter;

@lombok.Getter
public class BusinessException extends RuntimeException {

    private final int code;


    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    // 用来处理错误
    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}
