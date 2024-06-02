package aop.aspects;


import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    //@Before("execution/* getStudents())")
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("Before getStudentsLoggingAdvice, логируем получение списка " +
                "студентов перед методом getStudents");
    }
    @AfterReturning(pointcut = "execution(* getStudents())",returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudentBestAvegeGrey = students.get(1);
        String nameSurname = firstStudentBestAvegeGrey.getNameSurname();
        nameSurname = nameSurname.replace("Madatova", "Ismagilova");
        firstStudentBestAvegeGrey.setNameSurname(nameSurname);
        double avgGrade = firstStudentBestAvegeGrey.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudentBestAvegeGrey.setAvgGrade(avgGrade);
        System.out.println("afterReturningGetStudentsLoggingAdvice, логируем получение списка " +
                "студентов после метода getStudents");
    }
}
