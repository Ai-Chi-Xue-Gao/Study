package chouXiang;

abstract class Animal{
    abstract void shout();
}

class Dog extends Animal {
    void shout(){
        System.out.println("汪汪汪");
    }
}
