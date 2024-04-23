import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int prod = num1 * num2;
        double div = (double)num1 / num2;
        int mod = num1 % num2;

        System.out.printf("\nThe Sum is %d\n", sum);
        System.out.printf("The Product is %d\n", prod);
        System.out.printf("The Difference is %d\n", sub);
        System.out.printf("The Quotient is %.3f\n", div);
        System.out.printf("The Modulus is %d\n", mod);

        input.close();
    }
}
