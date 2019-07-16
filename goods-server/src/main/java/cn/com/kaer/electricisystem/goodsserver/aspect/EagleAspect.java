package cn.com.kaer.electricisystem.goodsserver.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Caorenpeng
 * 2019/7/15
 */
@Aspect
@Component
public class EagleAspect {
    @Pointcut(value = "execution(public * cn.com.kaer.electricisystem.goodsserver.controller.*.*(..))")
    public void ponitCut() {

    }


    @AfterReturning(pointcut ="ponitCut()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing(pointcut = "ponitCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }
}
