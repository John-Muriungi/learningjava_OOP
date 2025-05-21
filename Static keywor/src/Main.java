public class Main {
    public static void main(String[] args) {
       Friend friend1= new Friend("Harley");
       Friend friend2=new Friend("lance");
       Friend friend3= new Friend("Agnes");
       Friend friend4 =new Friend("Jeremy");
        Friend friend5 =new Friend("Jeremy");

//        System.out.println(friend1.numoffriends);// wiill work but still not good practise
        // to access a static variable it's best to get use the class instead of the object name
        System.out.println(Friend.numoffriends);//god practise.

// calling static method
        Friend.showFriends();

    }
}