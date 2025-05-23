public class Main {
    public static void main(String[] args) {

        Car car =new Car("charger", "yellow",100000);
        car.setColor("white");
        car.setPrice(500000);
        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getPrice());

    }
}