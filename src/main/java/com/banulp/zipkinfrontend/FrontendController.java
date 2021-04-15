package com.banulp.zipkinfrontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@RestController
public class FrontendController {

    private String backendEndpoint = "http://127.0.0.1:9000/api";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String callBackend() {

        return restTemplate.getForObject(backendEndpoint, String.class);
    }

}
