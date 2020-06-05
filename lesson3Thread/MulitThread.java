package lesson3Thread;

public class MulitThread {   //同时执行多个线程，然后在main
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0; i <20 ; i++) {
            final int j =i;
         Thread t= new Thread(()->{
                System.out.println(j);
            });
         t.start();
         threads[i] =t;  //调用线程
        }
        for (int i = 0; i < 20; i++) {      //自由打印0-20
            threads[i].join(1000);  //
        }
        System.out.println("main");
    }
}
