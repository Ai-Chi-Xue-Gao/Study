package jieKo;

public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("编号"+Animal.getID());
        Dog dog = new Dog();
        dog.info();
        dog.shout();
        dog.eat();
    }
}
