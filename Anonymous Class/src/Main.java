public class Main {
    public static void main(String[] args) {

        Dog dog =new Dog();
//        anonymous class
        Dog dog1= new Dog(){
            @Override
                    void speak(){
                System.out.println("Scoooby Doo says *Cheki Mbele*");
            }
        };

        dog.speak();


        dog1.speak();

    }
}