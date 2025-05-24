public class Main {
    public static void main(String[] args) {
        Book book1=new Book("The  Fellow of the Ring",423);
        Book book2=new Book("Pleasure Activism",333);
        Book book3=new Book("Let them theory ",272);

        Book[] books={ book1,book2,book3};



        Library library= new Library("Kisii university library",2025,books);
        library.displayInfo();




    }
}