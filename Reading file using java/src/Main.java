import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        String filePath="C:\\Users\\Administrator\\Desktop\\Extra.txt";


        try (BufferedReader reader= new BufferedReader(new FileReader(filePath))){
            String line;
            while((line= reader.readLine())!=null){
                System.out.println(line);

            }
        }catch (FileNotFoundException e){
            System.out.println("Could not locate file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}