package com.revature.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ArtAspect {
    Logger logger = Logger.getLogger(ArtAspect.class);
    /*
    * What is AOP?
    *   - Aspect Oriented Programming
    *
    * What is an Aspect?
    *   - An aspects purpose is to eliminate Cross Cutting Concerns (An aspect is going to be a class in our situation)
    *
    * What is Cross Cutting Concerns?
    *   - repetitive code required for the business logic in multiple methods
    *
    * What is an Advice?
    *   An advice is an action taken by an aspect.
    *       - In spring AOP, an advice is going to be a method
    *
    * What is a JoinPoint?
    *   - The possible locations in our application where an advice can be executed
    *
    * What is a PointCut?
    *   - expressions used to select specific join points
    *
    * Annotations of AOP:
    *   - @Before: advice executed before the joinpoint
    *   - @After: advice executed after the joinpoint
    *   - @AfterReturning: advice executed after successfully returning
    *   - @AfterThrowing: advice executed after exception is thrown
    *   - @Around: its the most powerful (it can execute the joinpoint multiple times through the advice)
    *
    * Wildcards in the PC expression:
    *   * : traditional wildcard meaning it can be anything
    *   .. : utilized with parameters and essentially means there can be any number of arguments/datatypes in the parameter
    *
    * */

    @Before("execution(* draw*(..))") //point cut expression
    public void beforeDrawing(JoinPoint joinPoint){ //random location in your project

        System.out.println("JOINPOINT: " + joinPoint.getSignature().getName());

        System.out.println("Buy my supplies"); // 15 lines of code
        System.out.println("Play some music"); // 7 lines of code
        System.out.println("Drink some coffee"); // 9 lines of code
    }

    //practical use of AOP
    @AfterThrowing(value = "execution(* draw*(..))", throwing = "e")
    public void afterDrawing(JoinPoint joinPoint, Exception e){
        logger.warn("An exception was thrown!", e);
        //System.out.println("Braggin to all my friends");
    }

    @Around("execution(* draw*(..))")
    public void testAroundAnnotation(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("Buy my supplies"); // 15 lines of code
        System.out.println("Play some music"); // 7 lines of code
        System.out.println("Drink some coffee"); // 9 lines of code

        pjp.proceed(); //invokes the joinpoint method

        System.out.println("Braggin to all my friends");
    }
}
