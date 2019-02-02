package com.huawei.hicloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1")
public class InfoController {

    private static final Logger logger = LoggerFactory.getLogger(InfoController.class);

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private Integer port;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Map<String, Object> getInfo() {
        logger.info("### Get info ...");
        HashMap<String, Object> result = new HashMap<>();
        result.put("port", port);
        result.put("name", name);

        return result;
    }

}
