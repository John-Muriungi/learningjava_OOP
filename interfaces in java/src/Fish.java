public class Fish implements Prey, Predator {
    @Override
    public void flee(){
        System.out.println("The fish is Swimming away");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is swimming towards its prey");
    }
}
