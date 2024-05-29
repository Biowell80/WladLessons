package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class SecuurityAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(JoinPoint joinPoint){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение " +
                "книги/журнала");
        System.out.println("__________________________________________________________________________________");
    }
}
