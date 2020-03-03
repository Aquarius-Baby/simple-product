package com.example.simple.common;


import java.lang.annotation.*;

@Documented
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Authorize {


}