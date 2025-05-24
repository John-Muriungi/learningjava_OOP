public class Main {
    public static void main(String[] args) {
        /*old method
        Integer a =new Integer(123);
        Double b = new Double(3.14);
        Boolean d=new Boolean(true);
        Character c=new Character ('%');

         */
//  autoboxing wrapping up primitive within a box
        Integer a =123;
        Double b =3.14;
        Boolean d=true;
        Character c='%';
        String  e ="pizza";
//unboxing removing the primitive
        int x=a;
        char y=c;
        //utility  classes

//        converting primitive to string
        String j=Integer.toString(123);
        String k=Double.toString(3.14);

        String l=Character.toString('e');

        String m=Boolean.toString(false);

        /// converting  string to primitive type

        int o=Integer.parseInt("1234");
        double p=Double.parseDouble("3.14");

        char q="pizza".charAt(0);
        boolean r=Boolean.parseBoolean("true");



//miscellaneous utility methods under wrapper class
        char letter='b';
        char myLetter='%';
        //checking if character is a letter
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isLetter(myLetter));

        //checking if its uppercase;
        System.out.println(Character.isUpperCase(letter));




    }
}