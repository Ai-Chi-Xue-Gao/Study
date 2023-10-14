package GouZao;

public class Student {
    private String name;
    private int age;

    //如果我们自己没有写任何的构造方法
    //那么虚拟机会给我们加一个空参构造方法
    public Student(){
        System.out.println("调用了无参构造方法");
    }

    public Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public String read(){
        return "我是："+name+",年龄："+age;
    }
}
