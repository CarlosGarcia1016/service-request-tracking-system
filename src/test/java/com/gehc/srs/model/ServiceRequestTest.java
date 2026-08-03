package com.gehc.srs.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceRequestTest {

    @Test
    void newRequestShouldHaveOpenStatus() {
        ServiceRequest request = new ServiceRequest(
            "Computer problem",
            "Laptop does not start"
        );

        assertEquals("OPEN", request.getStatus());
    }
}
