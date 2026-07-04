import java.time.YearMonth;

public class CalendarPrinter {
    public static void main(String[] args) {

        YearMonth ym=YearMonth.of(2026,7);

        System.out.println("Days: "+ym.lengthOfMonth());

        for(int i=1;i<=ym.lengthOfMonth();i++)
            System.out.println(i+" : "+ym.atDay(i).getDayOfWeek());
    }
}