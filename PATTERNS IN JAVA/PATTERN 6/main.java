/*       
         *
        **
       ***
      ****
     *****
*/

public class Pattern_6{
    public static void main(String [] args){
        int n = 5;

        // outer loop --> row
        for(int i = 1; i <= n; i++){
            // for spaces 
            for(int j = (n - i - 1); j >= 0; j--){
                System.out.print(" ");
            }

            // for stars 
            for(int j = 1; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
