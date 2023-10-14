package staticdome;

public class StaticTest {
    public static void main(String[] args){
        StaticDemo stu1 = new StaticDemo("张三",18);
        StaticDemo stu2 = new StaticDemo("李四",18);
        StaticDemo stu3 = new StaticDemo("王五",18);
        stu1.info();
        stu2.info();
        stu3.info();
        stu1.school = "B 大学";
        System.out.println("修改stu1学生对象的学校信息为B大学后");
        stu1.info();
        stu2.info();
        stu3.info();
    }
}
