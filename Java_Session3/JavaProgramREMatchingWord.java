import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class JavaProgramREMatchingWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex pattern you want to match :");
            Pattern patObj = Pattern.compile(sc.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = patObj.matcher(sc.nextLine());
            System.out.println("<Matching Obj has>"+matcher);
            System.out.println("*****************************");
            boolean found = false;
            while (matcher.find()) {
                System.out.println("I found the text "+matcher.group()+" starting at index "+
                        matcher.start()+" and ending at index "+matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found.");
            }
        }
    }
}