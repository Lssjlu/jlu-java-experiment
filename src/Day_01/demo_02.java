package Day_01;

public class demo_02 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i /10 %10;
            int bai = i / 10 /10 %10;
            if(Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3) == i){
                System.out.println(i);
            }
        }
    }
}
