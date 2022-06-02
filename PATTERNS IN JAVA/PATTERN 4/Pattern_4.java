/*  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5 */


import java.util.Scanner;

public class Pattern_4{
    public static void main(String [] args){
        int n = 5;
        System.out.println("The patter of solid right angled triangle! ");

        //outer loop --> row
        for(int i = 1; i <= n; i++){
            //inner loop --> column
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }    
}
