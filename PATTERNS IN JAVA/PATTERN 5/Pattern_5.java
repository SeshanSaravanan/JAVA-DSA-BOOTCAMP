/*  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/


import java.util.Scanner;

public class Pattern_5{
    public static void main(String [] args){
        int n = 5;
        System.out.println("The patter of solid right angled triangle! ");

        //UPPER HALF 
        //outer loop --> row
        for(int i = 1; i <= n; i++){
            //inner loop --> column
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //LOWER HALF 
        //outer- loop --> rows
        for(int i = n -1; i >= 1; i-- ){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }    
}
