import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


//play audio with java(.wav, .au,.aiff)
public class Main {
    public static void main(String[] args) {

        String filePath= "C:\\Users\\Administrator\\Desktop\\satooo shoot\\m\\1.wav";
        File file= new File(filePath);
        try(Scanner scanner=new Scanner(System.in); AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);){


        Clip clip =AudioSystem.getClip();
        clip.open(audioStream);
           String response="";

           while ( !response.equals("Q")){
               System.out.print("p= Play\n" +
                       "S= stop\n" +
                       "R= reset\n" +
                       "Q=quit\n" +
                       "enter your choice:");
               response=scanner.next().toUpperCase();

               switch (response){
                   case "P"->clip.start();
                   case "S"->clip.stop();
                   case "R"->clip.setMicrosecondPosition(0);
                   case "Q"->clip.close();
                   default -> System.out.println("invalid choice");
               }
           }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate  file");

        }
        catch (IOException e) {
            System.out.println("something went wrong");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        finally {
            System.out.println("Bye");

        }


    }
}