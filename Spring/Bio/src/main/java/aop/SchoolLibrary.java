package aop;


import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    public void getBook(String bookName) {
        System.out.println("We get a book from the SchoolLibrary");
    }
}
