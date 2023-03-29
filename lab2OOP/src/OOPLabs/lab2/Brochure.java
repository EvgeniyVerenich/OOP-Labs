package OOPLabs.lab2;

import jdk.jfr.Event;

public final class Brochure extends Publication{
    public Brochure(String name, String year, String author, String publisher) {
        super(name, year, author, publisher);
    }

    private Event event = new Event() {
        @Override
        public String toString() {
            return "Brochure -> " + getName() + " | " + getAuthor();
        }
    };

    @Override
    void read() {
        System.out.println("You're reading brochure");
    }

    @Override
    void write() {
        System.out.println("You're writing brochure");
    }

    @Override
    void burn() {
        System.out.println("You're burning brochure");
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
