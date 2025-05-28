import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<String,Double> map=new HashMap<>();
        map.put("Apple",0.50);
        map.put("Orange", 0.75);
        map.put("Banana",0.25);
        map.put("Coconut", 1.00);
        System.out.println(map);

//        adding a similar  key  overwrites the prevous key
        map.put("Banana",0.9999);
        System.out.println(map);



//        removing an item : name.remove(key)
        map.remove("Apple");
        System.out.println(map);

//        Getting a value associated with a key.use the get method
        System.out.println(map.get("Banana"));

//        checking if a value or key exists
        //for key
        System.out.println(map.containsKey("Banana"));
//        for the value =>   map.containsValue();
        if (map.containsKey("Banana")){
            System.out.println("the value of banana is: "+map.get("Banana"));
        }
        else {
            System.out.println("Key not found");
        }

//        getting the size of a map ..use .size() method
        System.out.println("The size of the HashMap is: "+map.size());

//        cycling through all the elements of a Hashmap
//    .keySet() returns all the keys in a HashMap
        for(String key: map.keySet()){
            System.out.println(key +" :Sh."+map.get(key));
        }





    }
}