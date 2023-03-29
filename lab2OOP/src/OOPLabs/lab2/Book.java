package OOPLabs.lab2;

import jdk.jfr.Event;

import java.util.EventListener;

public class Book extends Publication implements EventListener {

    private Event event = new Event() {
        @Override
        public String toString() {
            return "Book -> " + getName() + " | " + getAuthor();
        }
    };

    public Book(String name, String year, String author, String publisher) {
        super(name, year, author, publisher);
    }

    @Override
    void read() {
        System.out.println("You're reading book");
    }

    @Override
    void write() {
        System.out.println("You're writing book");
    }

    @Override
    void burn() {
        System.out.println("You're burning book");
    }

    @Override
    public Event getEvent() {
        return event;
    }

    @Override
    public void setEvent(Event event) {
        this.event = event;
    }
}
