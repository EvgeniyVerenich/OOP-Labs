package OOPLabs.lab2;

import jdk.jfr.Event;

public final class Textbook extends Publication{

    public Textbook(String name, String year, String author, String publisher) {
        super(name, year, author, publisher);
    }

    private Event event = new Event() {
        @Override
        public String toString() {
            return "Textbook -> " + getName() + " | " + getAuthor();
        }
    };

    @Override
    void read() {
        System.out.println("You're reading textbook");
    }

    @Override
    void write() {
        System.out.println("You're writing textbook");
    }

    @Override
    void burn() {
        System.out.println("You're burning textbook");
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
