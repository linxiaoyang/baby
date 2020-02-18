package com.shuqi.proxy;

import com.shuqi.proxy.fallback.UserServiceProxyFallbackFactory;
import com.shuqi.user.UserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author shuqi on 20/02/18.
 *
 * 作为服务的消费者，直接继承share包中provider提供的接口定义，
 * 打上@FeignClient标签，由consumer端形成动态代理，给consumer端使用
 */
@FeignClient(name = "baby-provider",fallbackFactory = UserServiceProxyFallbackFactory.class)
public interface UserServiceProxy extends UserService {
}
