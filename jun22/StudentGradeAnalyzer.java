public class StudentGradeAnalyzer {
    public static void main(String[] args) {

        int[] marks = {70,80,90,60,75};

        int sum = 0;

        for(int m : marks)
            sum += m;

        System.out.println("Average = " + sum/marks.length);
    }
}