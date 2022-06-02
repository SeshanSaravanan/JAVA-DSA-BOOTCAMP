 /* *
    **
    ***
    ****
    *****  */




import java.util.Scanner;

public class Pattern_2{
    public static void main(String [] args){
        int n = 5;
        System.out.println("The patter of solid right angled triangle! ");

        //outer loop --> row
        for(int i = 1; i <= n; i++){
            //inner loop --> column
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
