package Day_04;

//设计一个火车售票模拟程序Ticket.java。假设火车站有100张火车票要卖出，现在又5个售票点同时售票，用5个线程模拟这5个售票点的售票情况。
//要求如下
//1） 各个售票线程打印出自己所卖火车票的票号。 2） 同一张票不能被卖两次。

public class demo_01 {
    private static int ticket = 100;

    static class Mythread extends Thread {
        @Override
        public void run() {
            while (ticket > 0) {
                synchronized (demo_01.class) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + "卖出了第" + (100 - ticket + 1) + "张票");
                        ticket--;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();
        Mythread t4 = new Mythread();
        Mythread t5 = new Mythread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
