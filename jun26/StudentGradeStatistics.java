import java.util.ArrayList;
import java.util.Collections;

public class StudentGradeStatistics {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(92);
        marks.add(78);
        marks.add(66);
        marks.add(95);
        marks.add(88);

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.size();

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Marks : " + marks);
        System.out.println("Average : " + average);
        System.out.println("Highest : " + highest);
        System.out.println("Lowest : " + lowest);
    }
}