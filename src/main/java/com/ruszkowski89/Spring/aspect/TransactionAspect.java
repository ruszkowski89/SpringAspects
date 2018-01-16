package com.ruszkowski89.Spring.aspect;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TransactionAspect {

    @Around("@annotation(com.ruszkowski89.Spring.aspect.Loggable)")
    public Object allGettersAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

        Object returnValue = null;

        try {
            System.out.println("Before target method execution");
            returnValue = proceedingJoinPoint.proceed();
            System.out.println("After target method execution");
        } catch (Throwable e){
            System.out.println("When execution thrown");
        }
        System.out.println("after finally");

        return returnValue;
    }

}

