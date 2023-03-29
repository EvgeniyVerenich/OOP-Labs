package OOPLabs.lab2;

import jdk.jfr.Event;

public final class Magazine extends Publication{



    public Magazine(String name, String year, String author, String publisher) {
        super(name, year, author, publisher);
    }

    private Event event = new Event() {
        @Override
        public String toString() {
            return "Magazine -> " + getName() + " | " + getAuthor();
        }
    };

    @Override
    void read() {
        System.out.println("You're reading magazine");
    }

    @Override
    void write() {
        System.out.println("You're writing magazine");
    }

    @Override
    void burn() {
        System.out.println("You're burning magazine");
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
