import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word="watermelon";

        Scanner scanner=new Scanner(System.in);
        ArrayList<Character> wordState=new ArrayList<>();

        int wrongGuesses=0;
        for (int i = 0; i <word.length() ; i++) {
            wordState.add('_');


        }
        System.out.println("*************************");
        System.out.println("welcome to java Hangman");
        System.out.println("*************************");

     while(wrongGuesses<6){
         System.out.println(getHangmanArt(wrongGuesses));
         System.out.print("Word: ");
         for (char c:wordState){
             System.out.print(c+" ");

         }
         System.out.println();

         System.out.println("Guess a letter:");
         char guess = scanner.next().toLowerCase().charAt(0);

         if(word.indexOf(guess)>=0){
             System.out.println("Correct guess");
             for (int i = 0; i <word.length() ; i++) {
                 if(word.charAt(i)==guess){
                     wordState.set(i,guess);

                 }

             }if (!wordState.contains('_')){
                 System.out.println(getHangmanArt(wrongGuesses));
                 System.out.println("You Won!!");
                 System.out.println("The word was "+word);
             }
         }
         else {
             wrongGuesses++;
             System.out.println("wrong guess");
         }


     }
     if (wrongGuesses>=6){
         System.out.println(getHangmanArt(wrongGuesses));
         System.out.println("GAME OVER!!!");
         System.out.println("The word was: "+word);
     }


        scanner.close();
    }


    static  String getHangmanArt(int wrongGuesses){

        return  switch (wrongGuesses){
          case 0-> """
                  
                  
                  
                  """ ;
          case 1-> """
                    0
                  
                  
                  """;
            case 2-> """
                    0
                    |                 \s
                 \s
                 \s""";
            case 3-> """
                    0
                   /|                 \s
                 \s
                 \s""";
            case 4-> """
                    0
                   /|\\                \s
                 \s
                 \s""";
            case 5-> """
                    0
                   /|\\ 
                   /              \s
                 \s
                 \s""";
            case 6-> """
                    0
                   /|\\ 
                   / \\             \s
                 \s
                 \s""";
            default -> " ";



        };

    }
}