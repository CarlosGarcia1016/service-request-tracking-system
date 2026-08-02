package com.gehc.srs;

import com.gehc.srs.model.ServiceRequest;
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
