package com.banulp.zipkinfrontend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableAutoConfiguration
public class FrontendController {

    private static Logger log = LoggerFactory.getLogger(FrontendController.class);

    private String backendEndpoint = "http://127.0.0.1:9000/api";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String callBackend() {
        log.info("Handling home");
        return restTemplate.getForObject(backendEndpoint, String.class);
    }

}
