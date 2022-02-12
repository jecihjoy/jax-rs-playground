package com.github.jaxrsplayground.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping
    public String test() {
        return "Testing dispatcher servlet controller";
    }
}
