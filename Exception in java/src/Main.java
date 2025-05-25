import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Eneter a number");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("that wasn't a number");
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        } catch (Exception e) {//catch all exception just as the else state in if statement
            System.out.println("Something went wrong");
        }//this always executes


    }
}