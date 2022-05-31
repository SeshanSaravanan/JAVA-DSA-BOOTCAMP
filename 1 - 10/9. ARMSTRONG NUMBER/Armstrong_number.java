import java.util.Scanner;
import java.lang.Math;

public class Armstrong_number{
     //function to check if the number is Armstrong or not 
    static boolean isArmstrong(int n){
        int temp, digits = 0, last = 0, sum = 0;
           // assigning temp = n
        temp = n;
        while(temp > 0){
            temp = temp / 10;
            digits++;
        } 

        temp = n;
            
        while(temp > 0){
               // determines the last digit from the number
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }

        if (sum == n){
            return true;
        }
        
        else{
            return false;
        }
    } 

    //driver code    
    public static void main(String [] args){
        int initial_number, final_number;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the lower limit: ");
        initial_number = scan.nextInt();
        System.out.println("Enter the upper limit: ");
        final_number = scan.nextInt();
        
        System.out.println("Armstrong number from " + initial_number + " upto " + final_number);

        for(int i = initial_number; i < final_number; i++){

            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}