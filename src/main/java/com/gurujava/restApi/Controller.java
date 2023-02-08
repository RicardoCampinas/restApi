package com.gurujava.restApi;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping(value = "test")
    public String test() {
        return "hello world";
    }
}
