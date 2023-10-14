package chongXie;
class Animal{
    //定义动物叫的声音
    void shout(){
        System.out.println("动物发出叫声");
    }
}
//定义dog类继承Animal类
class Dog extends Animal{
    //重写父类Animal的shout()方法
    void shout(){
        System.out.println("汪汪汪");
    }
}
//定义测试类
public class test1 {
    public static void main(String[] args) {
        Animal dw = new Animal();
        dw.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}
