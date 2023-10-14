package Super;
class Animal{
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "名称："+this.getName()+"，年龄："+this.getAge();
    }
}
//定义Dog类继承Animal类
class Dog extends Animal{
    private String color;

    public Dog() {}

    public Dog(String name,int age,String color) {
        super(name,age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //重写父类的info()方法
    public String info(){
        return super.info()+"颜色："+this.getColor();
    }
}

public class Test1 {
    public static void main(String[] args) {
    Dog dog = new Dog("牧羊犬",3,"黑色");
        System.out.println(dog.info());
    }
}
