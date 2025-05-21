public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant= new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);


        dog.eat();
        cat.eat();

        System.out.println(  dog.live);
        System.out.println(cat.live);

        dog.speak();
        cat.speak();

        plant.photossynthesis();
        System.out.println(plant.isAlive);






    }
}