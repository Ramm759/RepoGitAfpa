package com.espaceptc.mylibrary.Exceptions;

public class ListParamException extends RuntimeException {
    /**
     * Exception generee si list est null
     * @param message
     */
    public ListParamException(String message) {
        super(message);
    }
}
