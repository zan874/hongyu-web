package com.example;

public class ResponseResult<T> {

    private boolean success;
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private T result;
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }

    private String error;
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    
    
}
