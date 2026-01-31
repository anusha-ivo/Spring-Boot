package com.example.swagger.use;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name="demo swag",description = "am learning swaggger to get handson")
public class Apis {
@Operation(summary = "get mapping",description = "get mapping is a here")
    @GetMapping("/hello")
    public String show(){
        return "from backend api";
    }

    @PostMapping("/{id}")
    public String dis(@PathVariable int id){
        return "id is "+id;

    }
}
