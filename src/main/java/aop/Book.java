package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Как закалялась сталь")
    private String name;

    @Value("Островский Н.А.")
    private String author;

    @Value("1920")
    private int yersOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYersOfPublication() {
        return yersOfPublication;
    }
}
