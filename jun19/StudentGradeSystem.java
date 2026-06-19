public class StudentGradeSystem {
    public static void main(String[] args) {

        int marks[] = {85,72,91,66};

        for(int m : marks){
            if(m>=90)
                System.out.println("A");
            else if(m>=75)
                System.out.println("B");
            else
                System.out.println("C");
        }
    }
}