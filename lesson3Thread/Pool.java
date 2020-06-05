package lesson3Thread;

public class Pool {
    private volatile static  boolean isStop;  //当前线程是否要被阻塞,中断线程
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (!isStop){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(3000); //特殊阻塞
        isStop=true;
    }
}
