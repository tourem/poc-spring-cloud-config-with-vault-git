package com.larbotech.confg.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${cleSecrete}")
    private String cleSecrete;

    @Value("${foo.bar}")
    private String foo;

    @RequestMapping("/")
    public String home(){
        return   String.format("Hello property from git %s! My secret key from vault is %s.", foo, cleSecrete);
    }
}
