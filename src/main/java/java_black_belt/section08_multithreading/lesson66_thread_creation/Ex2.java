package java_black_belt.section08_multithreading.lesson66_thread_creation;

public class Ex2 {

    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();

    }

}

class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

}

class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }

}
