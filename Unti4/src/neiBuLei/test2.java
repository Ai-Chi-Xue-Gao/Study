package neiBuLei;

class Outer25{
    int m = 0;
    void test25(){
        System.out.println("外部类成员方法test25()");
    }
    void test26(){
        class Inner{
            int n = 1;
            void show(){
                System.out.println("外部类成员变量 m = "+m);
                test25();
            }
        }
        Inner inner = new Inner();
        System.out.println("局部内部类变量 n = "+inner.n);
        inner.show();
    }
}
public class test2 {
    public static void main(String[] args) {
        Outer25 outer = new Outer25();
        outer.test26();
    }
}