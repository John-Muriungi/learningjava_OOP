public class Main {
    public static void main(String[] args) {

        Car car1=new Car("Mustang","Red");
        Car car2=new Car("Mazda ","blue");
        Car  car3 =new Car("Toyota","white");


// the data type of the  objects arrays is the class name
//       Car[] cars=new Car[3]; for empty array

//        when assigning
//        using predefined arrays
        Car[] cars={car1,car2,car3};
       for(Car car:cars){
           car.drive();
       }

//       defining  cars in the array... anonymous objects
        System.out.println("***********");
        Car[]cars1={
                new Car("Bentley","Red"),
                new Car("Ferari","blue"),
                new Car("Mercedes","black")
        };
        //changing the value of an attribute
        for (Car car:cars1){
            car.color="blue";

        }
       for (Car car:cars1){
           car.drive();

       }

    }
}