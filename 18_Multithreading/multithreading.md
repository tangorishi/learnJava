# Java Multithreading (Parallel Programming)

Java multithreading allows you to run multiple threads (smaller, concurrent units of a program) within a single Java program. This guide will introduce you to the basics of multithreading in Java.

## Table of Contents

1. [Introduction to Threads](#introduction-to-threads)
2. [Introduction to Multithreaded Programming](#introduction-to-multithreaded-programming)
3. [Thread class in Java](#thread-class-in-java)
4. [Sample Multithread application in Java](#sample-multithread-application-in-java)

## Introduction to Threads

- A thread is the smallest unit of execution in a program. It is a lightweight, independent path of execution within a process.

- Threads share the same memory space as the process they belong to, allowing them to access and modify shared data, making them useful for concurrent and parallel programming.

- Threads are used to perform multiple tasks concurrently, which can lead to better resource utilization, responsiveness, and improved performance in multi-core processors.

- Threads can run independently or in coordination with other threads, and they can be used for a wide range of purposes, from background tasks in user interfaces to complex parallel processing in server applications.

- If there occurs exception in one thread, it doesn't affect other threads.

## Introduction to Multithreaded Programming

Multithreaded programming involves the concurrent execution of multiple threads within a single program, enabling better utilization of modern multi-core processors. To understand the significance of multithreading, let's explore a simple example.

### Highway Traffic Analogy

Imagine a single-lane road where vehicles can only move in one direction at a time. If one car breaks down or encounters an obstacle, the entire traffic flow comes to a halt. It's similar to a single-threaded program that gets stuck when a time-consuming task is being executed.

Now, visualize a multithreaded highway with multiple lanes. If a car faces an issue in one lane, other vehicles can smoothly continue on the adjacent lanes, ensuring that traffic keeps flowing. In multithreaded programming, tasks are divided into separate threads, allowing the program to function smoothly even when one thread encounters a delay.

## Thread class in Java

In Java, the `Thread` class is a fundamental class provided by the Java Standard Library (`java.lang` package) for creating and managing threads. It is part of Java's multithreading support, and it's used to create and control threads within a Java program.

Here are some key aspects of the `Thread` class in Java:

- **Thread Creation**: You can create a new thread by either extending the `Thread` class or by implementing the `Runnable` interface and passing it to a `Thread` object.

- **Thread Execution**: To start the execution of a thread, you call the `start()` method of the `Thread` class. This method, in turn, calls the `run()` method that you override to define the thread's behavior.

- **Lifecycle Management**: Threads have a lifecycle that includes states like "New," "Runnable," "Blocked," and "Terminated." You can manage these states using various methods provided by the `Thread` class, such as `sleep()`, `join()`, and `interrupt()`.

- **Concurrency**: Threads can run concurrently and execute code independently. This enables parallel execution of tasks, which is essential for multitasking and utilizing multi-core processors effectively.

- **Thread Synchronization**: The `Thread` class also provides synchronization mechanisms, such as `synchronized` blocks and methods, to manage shared resources and ensure thread safety.

- **Thread Priority**: Threads can have priorities assigned to them using the `setPriority()` method. Priority levels help the operating system determine which threads to execute when multiple threads are competing for resources.

Here's a simple example of creating and starting a thread using the `Thread` class:

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // This starts the execution of the thread.
    }
}

```

## Sample Multithread application in Java

```java
public class MultithreadingDemo {
    public static void main(String[] args) {
        int numberOfThreads = 5; // Number of threads to create

        for (int i = 1; i <= numberOfThreads; i++) {
            Thread thread = new Thread(new PrintThread("Thread " + i));
            thread.start(); // Start the thread
        }
    }

    static class PrintThread implements Runnable {
        private String message;

        public PrintThread(String message) {
            this.message = message;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(message + " - Message " + i);
                try {
                    Thread.sleep(1000); // Sleep (pause the current thread) for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

```

### Explanation

In this program, we create multiple threads (specified by `numberOfThreads`) using the `Runnable` interface. Each thread has a `run()` method that prints a message five times with a 1-second pause between each print. Since the threads are running concurrently, you'll see their messages being printed at approximately the same time, demonstrating the concept of thread concurrency. The order in which the messages appear may vary on each run due to the concurrent nature of threads.
