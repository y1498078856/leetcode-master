package learncode;

/**
 * @Author yangxin8@asiainfo.com
 * @Date 2020/10/9 16:14
 * @Version 1.0
 * 并发AtomicInteger类
 */
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    private static final int THREADS_CONUT = 20;
    public static AtomicInteger count = new AtomicInteger(0);
    //使用volatile
//    public static volatile int count = 0;


    public static void increase() {
        count.incrementAndGet();
        //使用volatile
//        count++;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_CONUT];
        for (int i = 0; i < THREADS_CONUT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }


        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(count);
    }
}

