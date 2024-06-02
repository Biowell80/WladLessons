package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cats bean is created");
    }

    public Cat(String s) {
    }

    @Override
    public void say(){
        System.out.println("Cat says: Myaw-myaw");
    }

}


