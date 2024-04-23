import java.util.Scanner;

public class Q8 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input degree in Fahrenheit: ");
    double f = input.nextInt(); // f for fahrenheit

    double c = (f - 32) * 5 / 9; // c for celcius

    System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius",f,c);
    input.close();
   } 
}
