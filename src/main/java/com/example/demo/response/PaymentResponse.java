package com.example.demo.response;

public class PaymentResponse {
    private String status;
    private String message;

    public PaymentResponse() {}

    public PaymentResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {return status;}
    public String getMessage() {return message;}
    
    public void setStatus(String s) {
    	this.status=s;
    }
    public void setMessage(String m) {
    	this.message=m;
    }
}
