
 class MyThreadRunnable extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("My first thread is running");
            i++;
        }
    }
}

class MyThreadRunnable1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("My second thread is running");
            i++;
        }
    }
}

public class ThreadExample {  // renamed from 'Thread'
    public static void main(String[] args) {
        MyThreadRunnable t1 = new MyThreadRunnable();
        MyThreadRunnable1 t2 = new MyThreadRunnable1();

        t1.start();  // start thread t1
        t2.start();  // start thread t2
    }
}



