public class Main {
    public static void main(String[] args) {

       Person person=new Person("John ", "Muriungi");
       Students student=new Students("harry","maguire",3.5);
        Employee employee= new Employee("vincent", "kimathi",910000);

       person.showName();
        student.showName();
        System.out.println(student.gpa);

        employee.showSalary();
    }
}