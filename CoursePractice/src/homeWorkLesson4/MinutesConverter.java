package homeWorkLesson4;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 1560000;
        double days = 0;
        double years = 0;

        converterDays(minutes, days, years);

    }
        static public void converterDays(long givenMinutes, double givenDays, double years) {
        double minutesDay = 1440;

        givenDays = givenMinutes/minutesDay;

        years = givenDays/365;

        givenDays = (years-(int)years)*365;


        System.out.println(givenMinutes +" minutes is equal to: " + (int)years + " years" + " and " + (int)givenDays + " days." );

        }


}





