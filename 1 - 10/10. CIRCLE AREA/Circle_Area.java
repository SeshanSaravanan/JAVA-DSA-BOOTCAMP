import java.util.Scanner;

public class Circle_Area{
    public static void main(String [] args){
        double radius, area;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        radius = scan.nextInt();

        //formula to find the area of the circle

        area = 3.14 * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
