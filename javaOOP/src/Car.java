package javaOOP.src;

public class Car {
    //attributes
    String make ="Ford";
    String model="Mustang";
    int year=2022;
    double price=58000.99;
    boolean isRunning =false;


//    METHODS
    void start(){
        System.out.println("You started the engine");
        isRunning=true;
    }
    void stop(){
        System.out.println("You stopped the engine");
        isRunning
                =false;
    }
}
