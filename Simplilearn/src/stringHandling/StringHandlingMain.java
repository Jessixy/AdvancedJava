package stringHandling;

import java.util.Arrays;

public class StringHandlingMain {

    public static void main(String[] args) {
        System.out.println("String Handling");

        stringOperations();


    }

    static void stringOperations(){

        String str1 = "John is studying ";
        String str2 = "in College";


        // length method
        System.out.println(str1.length());

        // concat method
        String result = str1.concat(str2);
        System.out.println(result);

        // format method
        String r = String.format("The name of the student is " + "%s, and  the age is " + "variable is %d,", "John",
                21);
        System.out.println(r);

        // charAt method
        System.out.println(str1.charAt(5));

        // equals method
        if(str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }

        // indexOf method
        System.out.println(str1.indexOf('y'));
        // if character is not present
        System.out.println(str1.indexOf('z'));

        // replace method
        System.out.println(str1.replace('s', 'r'));

        // split method
        String[] strArr = str1.split(" ");
        Arrays.asList(strArr).forEach(System.out::println);

        // substring method
        String newStr1 = str1.substring(1, 5);
        System.out.println(newStr1);




    }
}
