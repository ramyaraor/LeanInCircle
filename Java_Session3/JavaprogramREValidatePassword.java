import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

// Java program to validate a userpassword String
// using Regular Expression or ReGex

class JavaprogramREValidatePassword {

    // Function to validate the userpasswordString
    public static boolean isValidPassword(String passwordString)
    {

        // Regex to check valid user passwordString.
        String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

        // Compile the ReGex
        Pattern patObj = Pattern.compile(regex);

        // If the user passwordString is empty
        // return false
        if (passwordString == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given userpasswordString
        // and regular expression.
        Matcher m = patObj.matcher(passwordString);

        // Return if the userpasswordString
        // matched the ReGex
        return m.matches();
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex password pattern to validate");
            Pattern obj = Pattern.compile(sc.nextLine());
            String s=obj.toString();
            String s2=String.valueOf(s);
            Boolean res = isValidPassword(s2);
            System.out.println("Result -> "+res);
        }
    }
}
