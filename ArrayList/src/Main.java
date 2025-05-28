import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> fruits=new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        System.out.println(fruits);


        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);

        System.out.println(numbers);
//        removing  an object froman arraylist
        fruits.remove(0);
        System.out.println(fruits);

//        replacing an element
        fruits.set(0,"Pineapple");
        System.out.println(fruits);

//        getting specific element
        String myFruit=fruits.get(1);
        System.out.println(myFruit);

//        getting total number of elements in your arrayList
        int length=fruits.size();
        System.out.println(length);


//        Sorting arrayList
        Collections.sort(fruits);
        System.out.println(fruits);

//        iterating over the arrayList
        fruits.add("mango");
        fruits.add("Avocado");

        for(String fruit:fruits){
            System.out.println(fruit);
        }

    }

}