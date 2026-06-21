public class StudentGrade {
    public static void main(String[] args) {
        int[] marks = {85, 72, 90, 65, 88};
        int total = 0;

        for (int m : marks) total += m;

        double avg = total / (double) marks.length;
        System.out.println("Average = " + avg);
    }
}