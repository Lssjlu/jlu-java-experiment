package Day_01;

public class demo_03 {
    private static final int num = 10;
    private double num01;
    private String str;

    public demo_03(int num01,String str){
        this.num01 = num01;
        this.str=str;
    }

    public demo_03(){

    }

    public demo_03(int num01){
        this.num01 = num01;
    }

    @Override
    public String toString() {
        return "demo_03{" +
                "num01=" + num01 +
                ", str='" + str + '\'' +
                '}';
    }

    public static void main(String[] args) {
        demo_03 dm = new demo_03();
        System.out.println(demo_03.num);
        demo_03 dm1 = new demo_03(20,"www");
        System.out.println(dm1.toString());
        demo_03 dm2 = new demo_03();
        System.out.println(dm2.toString());
        demo_03 dm3 = new demo_03(50);
        System.out.println(dm3.toString());
    }
}
