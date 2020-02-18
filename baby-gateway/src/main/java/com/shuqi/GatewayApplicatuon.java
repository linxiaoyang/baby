package com.shuqi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author shuqi on 20/02/18.
 *
 */
@EnableZuulProxy
@SpringCloudApplication
public class GatewayApplicatuon {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplicatuon.class, args);
    }

}
