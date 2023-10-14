package JiSuan;

import java.util.Scanner;

public class RunNian {
    public static void main(String[] args) {
        System.out.print("请输入需要计算的年份：");
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();

        if (Year % 4 == 0 & Year % 100 != 0 | Year % 400 == 0){
            System.out.println(Year+"是闰年");
        }else {
            System.out.println(Year+"不是闰年");
        }
    }
}
