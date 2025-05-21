package javaOOP.src;

public class Main {

    public static  void main(String[] args) {
        Car car =new Car();


        System.out.println(car);// gives out the memory
        //using the dot (.) operator to access attributes and ethods of a class
//        the  dot operator is followed  the attribute name
//        car.make

        System.out.println(car.make);
        System.out.println(car.isRunning);
        System.out.println();

// you can change the value of an attribute...
car.isRunning=true;
        System.out.println(car.isRunning);

        // calloing the methods
        car.start();
        if(car.isRunning){
            System.out.println("the engine is running ");
        }else {
            System.out.println("the car engine is not running");
        }
        car.stop();
        if(car.isRunning){
            System.out.println("the engine is running ");
        }else {
            System.out.println("the car engine is not running");
        }
    }


}