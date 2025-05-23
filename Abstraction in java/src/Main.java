public class Main {
    public static void main(String[] args) {

//        Shape shape=new Shape() // since its an abstract class we cant instantiate an object from it


        Circle circle=new Circle(3);
        Triangle triangle= new Triangle(4,5);
        Rectangle rectangle=new Rectangle(3,6);

            circle.display();
            triangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}