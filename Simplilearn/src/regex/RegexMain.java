package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

    public static void main(String[] args) {
        System.out.println("Regular Expressions");
        regexDemo();
    }

    static void regexDemo() {

        String regexStr = ".*[a-z][0-9].";

        // Create a Pattern object and compile the given regular expression
        Pattern pattern = Pattern.compile(regexStr);

        // Create a Matcher object that matches the given input against the pattern
        // String can start with anything, followed by char(s), followed by number(s)
        Matcher matcher =  pattern.matcher(("12345678abcdefd884239847329"));

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("No Match");
        }



    }


}
