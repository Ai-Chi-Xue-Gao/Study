package DuiXiang;

class Student {
    String name;
    private int age;
    public void setAge(int age){
        if(age<0){
            System.out.println("你输入的年龄有误");
        }else{
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    void read(){
        System.out.println("大家好，我是"+name+",年龄"+age);
    }

}

public class FengZhuang {
    public static void main(String args[]){
        Student stu1 = new Student();
        stu1.name = "吴名晨";
        stu1.setAge(21);
        stu1.read();
    }
}