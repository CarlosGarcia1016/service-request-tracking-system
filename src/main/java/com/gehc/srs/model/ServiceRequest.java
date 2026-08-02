package com.gehc.srs.model;

public class ServiceRequest {

    private Long id;
    private String title;
    private String description;
    private String priority;
    private String status;

    public ServiceRequest(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = "OPEN";
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
