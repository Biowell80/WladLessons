package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Vlad Ismagilov", book);
        uniLibrary.addMagazines();

        context.close();
    }

}
