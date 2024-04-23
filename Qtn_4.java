import java.util.Arrays;
public class Qtn_4 {
    //We create a constructor
    public Qtn_4(){
        
    }
    public double calculateMean(int[] array) {
    int sum = 0;
    for (int num : array) {
        sum += num;
    }
    return (double) sum / array.length;
    }
    public double calculateStandardDeviation(int[] array) {
    double mean = calculateMean(array);
    double sumSquaredDiff = 0;
    for (int num : array) {
        sumSquaredDiff += Math.pow(num - mean, 2);
    }
    return Math.sqrt(sumSquaredDiff / array.length);
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    Qtn_4 obj = new Qtn_4();
    double mean = obj.calculateMean(array);
    double standardDeviation = obj.calculateStandardDeviation(array);
    System.out.println("Mean: " + mean);
    System.out.println("Standard Deviation: " + standardDeviation);
    }
}