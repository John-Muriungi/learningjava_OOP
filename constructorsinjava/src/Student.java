public class Student {
    String name="John Muriungi";
    int age;
    double gpa;
    boolean isEnrolled;

    //constructor
    Student(String name,int age,double gpa){
        /*
        this key word reefers to the object you are currently constructing/Working with
        the parameter name of the constructor do not necessary need to be the same as the attribute name
         */
        this.name=name;
        this.age=age;
        this.gpa=gpa;
//        you can pass a value to a n attribute directly

        this.isEnrolled=true;

    }

    void  study(){
        System.out.println(this.name + " is Studying");


    }
}
