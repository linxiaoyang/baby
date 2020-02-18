package com.shuqi.proxy.fallback;

import com.shuqi.Result;
import com.shuqi.user.UserService;
import com.shuqi.user.dto.UserDTO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author shuqi on 20/02/18.
 * <p>
 * 提供fallback的优雅实现，可以获取到异常的堆栈
 */
@Slf4j
@Component
public class UserServiceProxyFallbackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public Result<Long> create(UserDTO userDTO) {
                log.info("UserServiceProxyFallbackFactory create throwable:{}", throwable);
                return Result.failed();
            }

            @Override
            public Result<UserDTO> queryById(Long id) {
                log.info("UserServiceProxyFallbackFactory queryById throwable:{}", throwable);
                return Result.failed();
            }
        };
    }
}
