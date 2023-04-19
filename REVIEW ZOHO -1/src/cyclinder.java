import java.util.Scanner;
import java.lang.Math;
public class cyclinder {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the radius of the cylinder: ");
        int radius = input.nextInt();
        System.out.print("Enter the height of the cylinder: ");
        int height = input.nextInt();
        total_Cylinder(radius, height);
    }
    static void total_Cylinder(int r, int h){
        float Area = (2*(int)Math.PI)*r*(r+h);
        System.out.println("Area of the cylinder is: "+Area);
    }
}
