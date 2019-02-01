package com.huawei.hicloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication {

    private static final Logger logger = LoggerFactory.getLogger(NacosProviderApplication.class);

    public static void main(String[] args) {
        logger.info("### Nacos provider application start ...");
        SpringApplication.run(NacosProviderApplication.class, args);
    }

}
