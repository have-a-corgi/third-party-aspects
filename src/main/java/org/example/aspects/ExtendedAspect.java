package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ExtendedAspect {

    @Pointcut("execution(* org.example.pojo.*.*())")
    public void scopeA() {}

    @After("scopeA()")
    public void action(JoinPoint jp) {
        System.out.println("After "+jp.getSignature().getName());
    }

}
