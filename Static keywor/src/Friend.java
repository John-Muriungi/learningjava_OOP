public class Friend {
    String name;
   static int numoffriends=0;

    Friend (String name){
        this.name= name;
        numoffriends++;
    }

    static  void showFriends(){
        System.out.println("You  have "+ numoffriends+" total friends");
    }
}
