package com.example.simple.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthorizeAspect {

    @Pointcut("execution(*com.example.demo.service.impl.*(.))")
    private void pointcut() {
    }


}
