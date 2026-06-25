import java.util.Scanner;

public class WeatherStatistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of days: ");
        int n = sc.nextInt();

        double[] temp = new double[n];

        double sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Temperature Day " + (i + 1) + ": ");
            temp[i] = sc.nextDouble();
            sum += temp[i];
        }

        double avg = sum / n;

        double max = temp[0];
        double min = temp[0];

        for (double t : temp) {

            if (t > max)
                max = t;

            if (t < min)
                min = t;
        }

        System.out.println("Average = " + avg);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        sc.close();
    }
}