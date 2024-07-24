package autoboxing_and_unboxing;

public class BoxingMain {

    public static void main(String[] args) {

        /*
        * Autoboxing: Automatic conversion of a primitive type to a object wrapper class
        * Unboxing: Automatic conversion a an object wrapper class to a primitive tye
        * */
        System.out.println("Autoboxing and Unboxing");

        int i = 10;

        // Autoboxing
        Integer iObj = Integer.valueOf(i);
        System.out.println("Value of iObj: " + iObj);

        // Unboxing
        int iUnboxed = iObj;
        System.out.println("Value of iUnboxed:  " + iUnboxed);

        // Example with char, Char
        System.out.println("---------------Char example -----------------");

        // Autoboxing
        Character charObj = 'a';
        System.out.println("Value of charObj: " + charObj);
        // can also be written as...
        char x = 'a';
        Character charA = Character.valueOf(x);
        System.out.println("x Value: " + charA);


        // Unboxing
        char ch = charObj;
        System.out.println("Value of ch: " + ch);


    }
}
