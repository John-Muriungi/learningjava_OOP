import java.util.ArrayList;
import java.util.Scanner;
//write a program that asks for user to enter the number of foods needed when done ask fir them to enter the foods
//then print out the foods entered
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> foods=new ArrayList<String>();

        System.out.println("Enter the niumber of food you would like");
        int numOfFood=scanner.nextInt();
        scanner.nextLine();//clearing input buffer

        for (int i = 1; i <=numOfFood ; i++) {

            System.out.println("Enter food number "+i+": ");
            String food=scanner.nextLine();
            foods.add(food);

        }
        System.out.println(foods);

        scanner.close();

    }
}