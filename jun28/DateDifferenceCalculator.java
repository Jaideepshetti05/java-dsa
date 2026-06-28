import java.time.*;

public class DateDifferenceCalculator{
    public static void main(String[] args){
        LocalDate d1=LocalDate.of(2026,1,1);
        LocalDate d2=LocalDate.now();

        System.out.println(java.time.temporal.ChronoUnit.DAYS.between(d1,d2));
    }
}