package OOPLabs.lab2;
// лаба 6

import jdk.jfr.Event;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("asfa", "2020","as", "aer");
        System.out.println(book.getEvent().toString());
        Publication publication = new Magazine("lhljlk","2023","ljlkj","bhgjgg");
        System.out.println(publication.getEvent().toString());

    }
}
