public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        Student student1 = new Student("john", 30, 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);
        Student student3=new Student("jean",29,4.0);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);


        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);


        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student3.study();
        student2.study();
    }

}