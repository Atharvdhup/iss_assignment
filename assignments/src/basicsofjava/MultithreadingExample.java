package basicsofjava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SharedResource {
    private volatile int counter = 0; // Volatile keyword for visibility

    // Thread-safe method using synchronization
    public synchronized void incrementCounter() {
        System.out.println(Thread.currentThread().getName() + " increments counter");
        counter++;
    }

    // Thread-safe block using synchronization
    public void decrementCounter() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " decrements counter");
            counter--;
        }
    }

    // Non-thread-safe method
    public void printCounter() {
        System.out.println("Counter: " + counter);
    }
}

public class MultithreadingExample {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating a Thread using Runnable interface
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.incrementCounter();
                try {
                    Thread.sleep(100); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-1");

        // Creating a Thread using Thread class
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    sharedResource.decrementCounter();
                    try {
                        Thread.sleep(100); // Simulating some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Thread-2");

        // Using ThreadPoolExecutor for thread management
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(thread1);
        executorService.submit(thread2);

        // Waiting for threads to finish
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // Do nothing, wait for threads to finish
        }

        // Non-thread-safe operation
        sharedResource.printCounter();
    }
}
