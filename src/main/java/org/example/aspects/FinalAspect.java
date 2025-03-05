package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public final class FinalAspect {

    @Pointcut("execution(* org.example.pojo.*.*())")
    public void scopeB() {}

    @Before("scopeB()")
    public void action(JoinPoint jp) {
        System.out.println("Before "+jp.getSignature().getName());
    }
}
