package Day_01;

import java.util.Scanner;

public class demo_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的名字:");
        String name = scanner.nextLine();
        System.out.print("请输入您的年龄:");
        int age = scanner.nextInt();
        System.out.print("请输入您的身高:");
        int height = scanner.nextInt();
        System.out.print("请输入您的体重:");
        int weight = scanner.nextInt();
        System.out.println("您的姓名是:" + name + ",您的年龄是:" + age + "岁，您的身高是:" + height + "厘米，您的体重是:" + weight + "千克");
    }
}
