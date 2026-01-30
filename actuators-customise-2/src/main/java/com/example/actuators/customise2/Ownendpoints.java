package com.example.actuators.customise2;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="myendpoint")
public class Ownendpoints {
    @ReadOperation
    public String show(){
        return "hi from myendpoint";
    }
}
