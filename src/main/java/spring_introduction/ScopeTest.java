package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Dog myDog = context.getBean("dog", Dog.class);
//        Dog myDog2 = context.getBean("dog", Dog.class);
//
//        System.out.println(myDog +" " + myDog2);
//        System.out.println(myDog==myDog2);
//        System.out.println(myDog.equals(myDog2));
//        myDog.say();

//        context.close();
//        ((DisposableBean)myDog).cleanUp();
      //  ((DisposableBean)myDog2).cleanUp();
    }
}
