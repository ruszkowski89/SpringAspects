package com.ruszkowski89.Spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransactionAspect {

    @Before("allGetters()")
    public void TransactionStartAdvice(){
        System.out.println("Transaction started.");
    }

    @Pointcut("execution(* getName())")
    public void allGetters(){}
}

