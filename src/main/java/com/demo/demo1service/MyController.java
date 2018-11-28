package com.demo.demo1service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/demo1")
    public Response demo1() {
        Response response = new Response();
        response.setMessage("demo1-> Hi");
        System.out.println("response.getMessage() = " + response.getMessage());
        return response;

    }
}
