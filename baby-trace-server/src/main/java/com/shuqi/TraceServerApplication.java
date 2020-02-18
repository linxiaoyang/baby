package com.shuqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author shuqi on 20/02/18.
 *
 * 利用zipkin进行分布式跟踪的启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class TraceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceServerApplication.class, args);
    }
}
