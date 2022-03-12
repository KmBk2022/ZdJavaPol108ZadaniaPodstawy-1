package pl.sdacademy.java.basic.exercises.day3.task8;

public class Poem {
    private Author author;
    private int stropheNumbers;

    public Poem(Author author, int stropheNumbers) {
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Author getAuthor() {
        return author;
    }

    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Poem{" +
                "author=" + author +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }
}
