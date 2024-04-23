public class Q10 {
    static void calculate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("The sum is %d", sum);
    }

    public static void main(String[] args) {
        calculate(100);
    }
}
