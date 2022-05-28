//2.	Take name as input and print a greeting message for that particular name.\

import java.util.*;

public class Greetings{
    public static void main(String[] args){

        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = scan.nextLine().toUpperCase(); // change into upper case 

        System.out.println("Hello " + name + "! \nGlad to meet you");
    }
}