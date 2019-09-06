package com.prosay.freemarker.cors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController  {

    @RequestMapping("/cors")
    public String cors() {
        return "this is cors mes";
    }
}
