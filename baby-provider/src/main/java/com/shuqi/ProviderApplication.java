package com.shuqi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author linyang on 19/10/11.
 */
@SpringCloudApplication
public class ProviderApplication {

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(ProviderApplication.class, args);
    }
}
