package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<Student>();

    public void addStudents() {
        Student st1 = new Student("Vlad Ismagilov", 4 , 3.3);
        Student st2 = new Student("Alfiya Madatova", 5 , 8.7);
        Student st3 = new Student("Puskin puskin", 4 , 9.3);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudents() {
        System.out.println("Information from method getStudents()");
        System.out.println(students);

    return students;}
}
