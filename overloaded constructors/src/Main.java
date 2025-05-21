public class Main {
    public static void main(String[] args) {

       User user1= new User("John Brian");
       User user2=new User("Henry kiptoo", "1243w@gmail.com");
       User user3=new User("kelly kon", "kk@gmail.com",23);
       User user4=new User();


//user 1
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
//user 2
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
// user 3
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
//use 4
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);


    }
}