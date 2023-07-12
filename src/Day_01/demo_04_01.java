package Day_01;

//静态绑定中，绑定可以在运行时或编译时解析。
//所有static，final和private方法的绑定过程都在编译时完成

public class demo_04_01 {
    public static class father {
        static void print(){
            System.out.println("father");
        }
    }

    public static class son extends father{
        static void print(){
            System.out.println("son");
        }
    }

    public static void main(String[] args) {
        father a = new father();
        father b = new son();
        a.print();
        b.print();
    }

}

