package com.shuqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shuqi on 20/02/18.
 *
 * 服务的注册与发现
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServerApplication.class, args);
	}

}
