/*
    *****    - 5 stars
    ****     - 4 stars
    ***         - 3
    **          - 2
    *  */       




import java.util.Scanner;

public class Pattern_3{
    public static void main(String [] args){
        int n = 5;
        System.out.println("The patter of solid inverted right angled triangle! ");

        //outer loop --> row
        for(int i = 1; i <= n; i++){
            //inner loop --> column
            for (int j = (n - i + 1); j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
