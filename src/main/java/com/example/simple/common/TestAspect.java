package com.example.simple.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {


    @Pointcut("execution(* com.cmy.demo.service.impl..*.*(..))")
    private void  test(){

    }
    @Around(value = "test()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object res =new Object();
        try {
            System.out.println("before service ");
            res = joinPoint.proceed();
            System.out.println("after service ");
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return res;
    }
}
