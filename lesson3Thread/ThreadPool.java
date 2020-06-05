package lesson3Thread;

public class ThreadPool {
//    private static class worker extends  Thread{
//
//    }
public static void main(String[] args) throws InterruptedException {
   Thread t= new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Thread baby");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
   });
//   t.setDaemon(true);
   t.start();
   t.join(1000);
    System.out.println("main");
}
}
