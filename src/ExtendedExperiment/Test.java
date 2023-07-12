package ExtendedExperiment;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.init();
        Vehicle res = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要租赁的汽车品牌：");
        String brand = scanner.nextLine();
        System.out.println("请输入您要租赁的汽车类型：");
        String type = scanner.nextLine();
        System.out.println("请输入您要租赁的汽车座位数：");
        String seatNum = scanner.nextLine();
        res = operation.match(brand,type,seatNum);
        System.out.println("请输入您要租赁的天数：");
        int days = scanner.nextInt();
        double price = res.callrent(days);
        System.out.println("您需要支付的租金为：" + price);
    }

}
