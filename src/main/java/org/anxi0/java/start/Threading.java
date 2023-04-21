package org.anxi0.java.start;

import java.lang.Exception;
import java.util.ArrayList;

public class Threading {

    public static void main() {
//        ArrayList<Thread> threads = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
////            Thread t = new Sample(i);
//            Thread t = new Thread(new ISample(i));
//            t.start();
//            threads.add(t);
//        }
//        for (int i = 0; i < threads.size(); i++) {
//            Thread t = threads.get(i);
//            try {
//                t.join();
//            } catch (Exception e) {
//
//            }
//        }
//        System.out.println("main end");

        Q3();
    }
    private static void Q3(){
        ArrayList<Thread> works = new ArrayList();
        long start = System.currentTimeMillis();
        for (int i = 1; i < 5; i++) {
            Thread w = new Thread(new HeavyWork("w"+i));
            w.start();
            works.add(w);
        }
        for(Thread work: works){
            try{
                work.join();
            }catch(Exception e){}

        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }

}

class Sample extends Thread {

    int seq;

    public Sample(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + "Thread start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Interrupted occurred");
        }
        System.out.println(this.seq + "Thread end");
    }
}

class ISample implements Runnable {

    int seq;

    public ISample(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq + " thread start.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end.");
    }
}
class HeavyWork extends Thread implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        work();
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}
