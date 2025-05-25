import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//writing without the destination
        try( FileWriter writer=new FileWriter("test.txt");){
          writer.write("i like pizza!");
            System.out.println("file has been written");
        }
        catch (IOException  e) {
            System.out.println("Could not write file");
        }

        //writing to a given file path
        try(FileWriter writer1=new FileWriter("C:\\Users\\Administrator\\Desktop\\blessed.txt")){
            writer1.write("I feel so blessed today\n" +
                    "today is on sunday");
            System.out.println("The blessed file has been written");

        } catch (FileNotFoundException e) {
          //for catching the exception where the file is not found
            System.out.println("couldn't  find file location");
        }


    }
}