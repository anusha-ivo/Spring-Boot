package com.example.actuators.customise;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="greeting")
public class Endpointcreation {
    @ReadOperation
    public String show(){
        return " hi from custom endpoint";
    }
}
