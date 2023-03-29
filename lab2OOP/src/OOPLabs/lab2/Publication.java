package OOPLabs.lab2;

import jdk.jfr.Event;

public abstract class Publication {

    private String name, year, author, publisher;

    private Event event = new Event() {
        @Override
        public String toString() {
            return "Publication -> " + getName() + " | " + getAuthor();
        }
    };

    public Publication(String name, String year, String author, String publisher){
        this.name = name;
        this.year = year;
        this.author = author;
        this.publisher = publisher;
    }

    abstract void read();
    abstract void write();
    abstract void burn();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
