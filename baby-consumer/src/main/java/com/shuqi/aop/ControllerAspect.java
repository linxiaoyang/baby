package com.shuqi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author shuqi on 20/02/18.
 * 切面类
 */
@Component
@Aspect
public class ControllerAspect {

    /**
     * 切点
     * <p>
     * 拦截的是IndexController中的所有的public方法
     */
    @Pointcut("execution(public * com.shuqi.controller.IndexController.*(..))")
    public void pointcut() {}

    @Before("pointcut()")
    public void before(){
        System.out.println("before");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around");
        return pjp.proceed();
    }


}
