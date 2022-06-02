 /* *****
    *****
    *****
    *****
    ***** */


import java.util.Scanner;

public class Pattern_1{
    public static void main(String [] args){
        int n = 5;
        System.out.println("The patter of solid rectangle! ");

        //outer loop --> row
        for(int i = 1; i <= n; i++){
            //inner loop --> column
            for (int j = 1; j <= 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
