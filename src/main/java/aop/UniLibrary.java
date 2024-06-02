package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("I am get a Book from UniLibrary: ");
        System.out.println("__________________________________________________________________________________");
    }

    public void returnBook(){
        System.out.println("I am returning a Book from UniLibrary");
        System.out.println("__________________________________________________________________________________");
    }

    public void getMagazine(){
        System.out.println("I am get a journal from the UniLibrary");
        System.out.println("__________________________________________________________________________________");
    }

    public void returnMagazine(){
        System.out.println("I am comback a journal from the UniLibrary");
        System.out.println("__________________________________________________________________________________");
    }
    public void addBook(String person_name, Book book ){
        System.out.println("I am adding a book from UniLibrary");
        System.out.println("__________________________________________________________________________________");
    }
    public void addMagazines(){
        System.out.println("I am adding a magazine from UniLibrary");
        System.out.println("__________________________________________________________________________________");
    }
}
