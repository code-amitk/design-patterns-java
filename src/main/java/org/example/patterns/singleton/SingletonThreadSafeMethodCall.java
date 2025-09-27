package org.example.patterns.singleton;

public class SingletonThreadSafeMethodCall {


    public static void main(String[] args) {

        // Create 100 threads trying to access the Singleton
        Runnable task = () -> {
            SingletonThreadSafe instance = SingletonThreadSafe.getThreadSafeInstance();
            System.out.println(Thread.currentThread().getName() + " - " + instance.hashCode());
        };

        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(task, "Thread-" + i);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < 100; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
