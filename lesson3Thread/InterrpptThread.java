package lesson3Thread;

public class InterrpptThread {
    public static void main(String[] args) throws InterruptedException {
        //1在线程阻塞时中断
//     Thread t= new Thread(()->{
//                try {
//                    while (!Thread.interrupted()) {      //是否被终端掉-->判断终端的标志位
//                        System.out.println(Thread.currentThread().getName());
//                        Thread.sleep(10000);  //抛出异常
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//        });
//     t.start();
//     Thread.sleep(3000); //特殊阻塞
////        isStop=true;
//        t.interrupt();
        //2
//        Thread t= new Thread(()->{
//                while (!Thread.interrupted()) {      //是否被终端掉-->判断终端的标志位，isInterrupted=true;
//                    try {
//                        System.out.println(Thread.currentThread().getName());
//                        Thread.sleep(10000);  //抛出异常
//                    } catch (InterruptedException e) {//抛出interrupted中断线程
//                        e.printStackTrace();
//                    }
//                }
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//        });
//        t.start();
//        Thread.sleep(3000); //特殊阻塞
////        isStop=true;
//        t.interrupt();   //t.isInterrupted=true;
//    }
//        Thread t  = new Thread(()->{   //
////            try {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(Thread.interrupted());//  调用方法时设置为true,,boolean tmp=isI
////                        Thread.sleep(10);
//                    }
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//        });
//        t.start();//
////        Thread.sleep(1000);
//        t.interrupt();//
        Thread t  = new Thread(()->{   // isInterupted不重置标志位
//            try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().isInterrupted()                   );//  调用方法时设置为true,,boolean tmp=isI
//                        Thread.sleep(10);
            }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        });
        t.start();//
//        Thread.sleep(1000);
        t.interrupt();//
  }
}

