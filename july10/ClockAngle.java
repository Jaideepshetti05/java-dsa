public class ClockAngle {

    public static void main(String[] args){

        int hour=5;

        int minute=45;

        double angle=Math.abs((30*hour+0.5*minute)-(6*minute));

        angle=Math.min(angle,360-angle);

        System.out.println(angle);
    }
}