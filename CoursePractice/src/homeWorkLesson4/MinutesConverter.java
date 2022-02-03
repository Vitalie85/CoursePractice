package homeWorkLesson4;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 1560000;
        double days = 0;
        double years = 0;

        converterDays(minutes);

    }
        static public void converterDays(long givenMinutes) {
        int minutesDay = 1440;
        double convMinToDays = givenMinutes/minutesDay;
        double convDaysToYears = convMinToDays/365;
        double days = (convDaysToYears % 1);
        double years = convDaysToYears - days;

            days *=365;

            //System.out.println(givenMinutes +" minutes is equal to: " + years + " years and " + days + " days." );

        System.out.println(givenMinutes+" minutes is equal to: " + String.format("%.0f",years) + " years and " + String.format("%.0f",days) + " days" );
        }
}





