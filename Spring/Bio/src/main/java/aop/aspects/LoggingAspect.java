package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazine() {}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazine()")
    private void allMethodsFromUniLibraryAndReturnMagazine() {}

    @Before("allMethodsFromUniLibraryAndReturnMagazine()")
    public void beforeAllMethodsFromUniLibraryAndReturnMagazine(){
        System.out.println("beforeAllMethodsFromUniLibraryAndReturnMagazine: log #666");
    }
















//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetMethodsFromUniLibraryAndReturn() {}
//
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writting log #1 " );
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writting log #2 " );
//    }
//
//    @Before("allGetMethodsFromUniLibraryAndReturn()")
//    public void beforeGetLoggingAdviceAndReturn() {
//        System.out.println("beforeGetLoggingAdviceAndReturn: writting log #3 " );
//    }
//



//    @Pointcut("execution(* get*())")
//    private void allGetMetods() {}
//
//    @Before("allGetMetods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
//    }
//    @Before("allGetMetods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение " +
//                "книги/журнала");
//    }
}
