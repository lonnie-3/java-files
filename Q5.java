import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        int prod = num1 * num2;
        System.out.println(prod);

        input.close(); // to avoid potential resource leaks
    }
}