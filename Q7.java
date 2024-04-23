import java.util.Scanner;

public class Q7 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input the radius: ");
    int radius = input.nextInt();

    double area = Math.PI * Math.pow(radius, 2);

    System.out.printf("The area of the circle is %.3f", area);

    input.close();
   } 
}
