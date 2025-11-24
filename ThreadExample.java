
//  class MyThreadRunnable extends Thread {
//     public void run() {
//         int i = 0;
//         while (i < 4000) {
//             System.out.println("My first thread is running");
//             i++;
//         }
//     }
// }

// class MyThreadRunnable1 extends Thread {
//     public void run() {
//         int i = 0;
//         while (i < 4000) {
//             System.out.println("My second thread is running");
//             i++;
//         }
//     }
// }

// public class ThreadExample {  // renamed from 'Thread'
//     public static void main(String[] args) {
//         MyThreadRunnable t1 = new MyThreadRunnable();
//         MyThreadRunnable1 t2 = new MyThreadRunnable1();

//         t1.start();  // start thread t1
//         t2.start();  // start thread t2
//     }
// }



// runnable thread

// class MyThreadRunnable implements Runnable {
//     public void run() {
//         int i = 0;
//         while (i < 4000) {
//             System.out.println("My first thread is running");
//             i++;
//         }
//     }
// }

// class MyThreadRunnable1 implements Runnable {
//     public void run() {
//         int i = 0;
//         while (i < 4000) {
//             System.out.println("My second thread is running");
//             i++;
//         }
//     }
// }

// public class ThreadExample {
//     public static void main(String[] args) {
//         MyThreadRunnable t1 = new MyThreadRunnable();
//         MyThreadRunnable1 t2 = new MyThreadRunnable1();

//         Thread gun1 = new Thread(t1);
//         Thread gun2 = new Thread(t2);

//         gun1.start();
//         gun2.start();
//     }
// }


//   class astha extends Thread{
//     public astha(String name){
//     super(name);
//     }
//     public void run(){
//         int i=34;
//         System.out.println("thankyou");
//         while(true){
//             System.out.println("run thread");
//         }
//     }
//   }
  
//  public class ThreadExample{
//     public static void main(String[] args) {
//         astha a1=new astha("upadhyaya");
//         a1.start();
//         System.out.println("the id of threasd is  " + a1.getId());
//         System.out.println("then name " + a1.getName());
//     }
//  }


//Java Thread Priorities
  


class MyThreadRunnable extends Thread {
    MyThreadRunnable(String name){
super(name);
    }
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("My first thread is running" + this.getName());
            i++;
        }
    }
}



public class ThreadExample {  // renamed from 'Thread'
    public static void main(String[] args) {
        MyThreadRunnable t1 = new MyThreadRunnable("astha");
        MyThreadRunnable t2 = new MyThreadRunnable("upadhyay");
        MyThreadRunnable t3 = new MyThreadRunnable("peehu");
        

        t1.start();  // start thread t1
        t2.start(); 
        t3.setPriority(Thread.MAX_PRIORITY);

         // start thread t2
    }
}


