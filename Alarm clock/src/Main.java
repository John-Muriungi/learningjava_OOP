import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // java Alarm clock

        Scanner scanner =new Scanner(System.in);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime=null;
        while(alarmTime==null){
            try{
                System.out.print("Enter an alarm time(HH:MM:SS): ");
                String inputTime=scanner.nextLine();

                alarmTime=LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm is set for: "+alarmTime);
            }
            catch(DateTimeParseException e){
                System.out.println("Wrong input! Time should be in HH:MM:SS");


            }

        }

        AlarmClock alarmClock=new AlarmClock(alarmTime);
        Thread alarmThread=new Thread(alarmClock);
        alarmThread.start();

        scanner.close();
    }
}