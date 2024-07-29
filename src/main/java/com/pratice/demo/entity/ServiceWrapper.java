package com.pratice.demo.entity;

public class ServiceWrapper {
    private Long userId;
    private String serviceDescription;
    private Double servicePrice;

    public ServiceWrapper(Long userId, String serviceDescription, Double servicePrice) {
        this.userId = userId;
        this.serviceDescription = serviceDescription;
        this.servicePrice = servicePrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }
}
