import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inches = input.nextInt();

        double meters = inches * 0.0254;

        System.out.printf("%.1f inches is equal to %.1f meters", inches, meters);
        input.close();
    }
}
