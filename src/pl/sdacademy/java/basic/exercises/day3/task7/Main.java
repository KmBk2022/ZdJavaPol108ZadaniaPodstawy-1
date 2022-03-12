package pl.sdacademy.java.basic.exercises.day3.task7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Mruczek");
        cats[1] = new Cat("Filemon");
        cats[2] = new Cat("Bonifacy");

        int i = 2;
        for(Cat element : cats) {
            element.print();
            element.makeSound();
            element.eatMice(i++ * i);
            System.out.println();
        }
    }
}
