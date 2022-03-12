package pl.sdacademy.java.basic.exercises.day3.task8;

public class Main {

    public static void main(String[] args) {
        Poem[] poems = initData();
        String surname = getSurnameWithMaxStropheNumbers(poems);
        System.out.println(surname);

        Author author = getSurnameWithMaxStropheNumbers_2(poems);
        System.out.println(author);
    }

    private static Poem[] initData() {
        Poem[] poems = new Poem[3];

        Author author1 = new Author("Tuwim", "PL");
        Author author2 = new Author("Konopnicka", "PL");
        Author author3 = new Author("Chotomska", "PL");

        poems[0] = new Poem(author1, 25);
        poems[1] = new Poem(author2, 35);
        poems[2] = new Poem(author3, 15);

        return poems;
    }

    private static String getSurnameWithMaxStropheNumbers(Poem[] poems) {
        int max = 0;
        String surname = null;
        for (Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                surname = poem.getAuthor().getSurname();
            }
        }
        return surname;
    }

    private static Author getSurnameWithMaxStropheNumbers_2(Poem[] poems) {
        int max = 0;
        Author author = null;
        for (Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                author = poem.getAuthor();
            }
        }
        return author;
    }
}
