import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("The number is negative");
        } else if (num > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is zero");
        }

        input.close();
    }        
}
