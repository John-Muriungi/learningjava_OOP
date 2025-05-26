import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // current date
        LocalDate date= LocalDate.now();

        // current time
        LocalTime time= LocalTime.now();

          //both date and time
        LocalDateTime dateTime= LocalDateTime.now();

        //display

        System.out.println("The date today is: "+date);
        System.out.println("The time is: "+time);;
        System.out.println("The  date and time is: "+dateTime);

        //utc timestamp
        Instant instant = Instant.now();

        //display
        System.out.println(instant);

//        custom format
        DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime=dateTime.format(formater);

//        output
        System.out.print("Formatted date is: ");
        System.out.println(newDateTime);

//        setting date for specific day
        LocalDate date1= LocalDate.of(2025,1,1);
        LocalDateTime dateTime1=LocalDateTime.of(2025,4,12, 12,0,0);

        //display dates
        System.out.println("displaying a set date: "+date1);
        System.out.println("displaying set dateTime: "+dateTime1);

        // comparing dates

        if (date.isBefore(date1)){
            System.out.println(date +"is earlier than date: "+date1);
        }
        else if(date.isAfter(date1)){
            System.out.println(date +"is latter than date: "+date1);
        } else if (date.isEqual(date1)) {
            System.out.println("THIs dates are the same!");

        }


        //comparing date

    }
}