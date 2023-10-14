package jieKo;

interface Animal {
    int ID = 1;
    public String NAME = "牧羊犬";
    public void shout();
    public void info();
    static int getID(){
        return Animal.ID;
    }
}

abstract class Action{
    public abstract void eat();
}

class Dog extends Action implements Animal{
    public void eat(){
        System.out.println("喜欢吃骨头");
    }
    public void shout(){
        System.out.println("汪汪汪");
    }
    public void info(){
        System.out.println("名称："+NAME);
    }
}