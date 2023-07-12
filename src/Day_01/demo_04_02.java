package Day_01;

//动态绑定：在运行时根据具体对象的类型进行绑定

public class demo_04_02 {
    public static class father {
        void print(){
            System.out.println("father");
        }
    }

    public static class son extends father{
        @Override
        void print(){
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

