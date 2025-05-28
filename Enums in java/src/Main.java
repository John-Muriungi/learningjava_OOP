import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String response= scanner.nextLine().toUpperCase();

      try {
          Day day = Day.valueOf(response);


          System.out.println(day);
          //to get the value associeted to the day
//        day.getDayNumber();
          System.out.println(day.getDayNumber());

          switch (day) {
              case MONDAY,
                   TUESDAY,
                   WEDNESDAY,
                   THURSDAY,
                   FRIDAY -> System.out.println("its a weekday");
              case SATURDAY, SUNDAY -> System.out.println("its the weekend!!");


          }

      }
      catch (IllegalArgumentException e){
          System.out.println("Please enter a  valid  day");
      }

    }
}