package Day_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int num=0;
        while (true){
            try{
                num=sc.nextInt();
                if(num==999){
                    break;
                }
            }catch(InputMismatchException e){
                sc.next();
                continue;
            }
            sum+=num;
        }
        System.out.println("结果是："+ sum);
    }
}
