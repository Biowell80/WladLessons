package spring_introduction;

public class DisposableBean {
    public  void cleanUp() {
        System.out.println("Удаляем объекты cleanUp");
    }
}
