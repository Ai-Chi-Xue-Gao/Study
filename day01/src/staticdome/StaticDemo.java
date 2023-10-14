package staticdome;

class StaticDemo {
    String name;
    int age;
    static String school="A 大学";

    public StaticDemo(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("姓名："+this.name+",年龄："+this.age+",学校："+school);
    }
}
