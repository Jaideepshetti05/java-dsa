public class AverageOfArray {
    public static void main(String[] args) {
        double[] arr = {10.5, 20.0, 30.5, 40.0, 50.5};
        double sum = 0;
        
        for (double val : arr) {
            sum += val;
        }
        
        double avg = sum / arr.length;
        System.out.println("Average: " + avg);
    }
}
