import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.setDaemon(true);// helps the
        thread.start();


        System.out.print("You have 5 seconds to enter your name\n" +
                "Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Hello "+name);



        scanner.close();
    }
}