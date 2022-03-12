package pl.sdacademy.java.basic.exercises.day3.task7;

import java.util.Objects;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Miau miau");
    }

    void eatMice(int mice) {
        System.out.println("I ate " + mice + " mice");
    }

    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if(this == o) return true;
//        if(o == null || getClass() != o.getClass()) return false;
//        Cat cat = (Cat) o;
//        return Objects.equals(name, cat.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
