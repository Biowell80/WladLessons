package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazine() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazine()")
//    private void allMethodsFromUniLibraryAndReturnMagazine() {}
//
//    @Before("allMethodsFromUniLibraryAndReturnMagazine()")
//    public void beforeAllMethodsFromUniLibraryAndReturnMagazine(){
//        System.out.println("beforeAllMethodsFromUniLibraryAndReturnMagazine: log #666");
//    }
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


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

       MethodSignature methodSignature =(MethodSignature) joinPoint.getSignature();
        System.out.println("Сигнатура метода = " + methodSignature);
        System.out.println("methodSignature.getMethod= " + methodSignature.getMethod());
        System.out.println("methodSignature.getMethod = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getMethod = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for (Object obj : args){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Info from the Book: name- " + myBook.getName() +
                            " , author- " + myBook.getAuthor() + " , years of public- " + myBook.getYersOfPublication());
                } else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет" + obj);
                }
            }
        }

        System.out.println("beforeGetBookAdvice:логирование попытки получить книгу/журнал");
        System.out.println("__________________________________________________________________________________");
    }

}
