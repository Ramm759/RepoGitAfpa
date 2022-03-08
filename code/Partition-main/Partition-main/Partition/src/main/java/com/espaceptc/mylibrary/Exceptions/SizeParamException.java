package com.espaceptc.mylibrary.Exceptions;

public class SizeParamException extends RuntimeException {
    /**
     * Exception generee si size incorerct
     * @param message
     */
    public SizeParamException(String message) {
        super(message);
    }
}
