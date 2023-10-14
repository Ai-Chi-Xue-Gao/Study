package neiBuLei;

class Outer{
    int m = 0;
    void test1(){
        System.out.println("外部类成员方法test1()");
    }
    class Inner{
        int n = 1;
        void show1(){
            System.out.println("外部类成员变量m = "+m);
            test1();
        }
        void show2(){
            System.out.println("内部成员方法show2()");
        }
    }
    void test2(){
        Inner inner = new Inner();
        System.out.println("内部类成员变量n = "+inner.n);
        inner.show2();
    }
}

public class test1{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show1();
        outer.test2();
    }
}