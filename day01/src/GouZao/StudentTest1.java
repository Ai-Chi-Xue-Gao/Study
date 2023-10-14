package GouZao;

public class StudentTest1 {
    public static void main(String[] args){
        //创建对象
        //调用的空参构造
        //Student s = new Student();

        Student s = new Student("张三",23);
        System.out.println(s.read());
    }
}
