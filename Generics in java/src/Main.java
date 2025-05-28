

public class Main {
    public static void main(String[] args) {

//generics gives compatibility with different data types
//        remember to use type argument when  creating the object
        Box <String> box=new Box<>();

        box.setItem("banana");
        System.out.println(box.getItem());

        Box <Integer> box1=new Box<>();
        box1.setItem(5);
        System.out.println(box1.getItem());

//        for product's obbject

        Product<String, Double> product=new Product<>("Kamusi", 1500.0);
        System.out.println("the price of one "+ product.getItem()+" is Sh."+product.getPrice());
        Product<String, Integer> product1=new Product<>("Ticket",20000);
        System.out.println("the price of one "+ product1.getItem()+" is Sh."+product1.getPrice());



    }
}