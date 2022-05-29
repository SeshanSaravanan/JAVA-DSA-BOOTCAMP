// To find out whether the given String is Palindrome or not 
import java.util.*;

public class Palindrome{
    public static void main(String [] args){ 
        
        String word, rev = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        word = scan.nextLine().toLowerCase();

        int length = word.length();

        for(int i = length - 1; i >= 0; i--){
            rev += word.charAt(i);
        }

        if(word.equals(rev)){
            System.out.println("The given String is Palindrome!");
        }
        else{
            System.out.println("The given String is not a Palindrome!");
        }
    }
}