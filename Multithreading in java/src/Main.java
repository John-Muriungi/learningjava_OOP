public class Main {
    public static void main(String[] args) throws InterruptedException {



//        MyRunnable myRunnable=new MyRunnable();
        Thread thread =new Thread(new MyRunnable());
        Thread thread1 =new Thread(new MyRunnable());


        System.out.println("Start count");
        thread.start();
        thread1.start();

       try {
           thread1.join();
           thread.join();
       } catch (InterruptedException e) {
           System.out.println("Thread was interrupted");
       }


        System.out.println("End count");






    }
}