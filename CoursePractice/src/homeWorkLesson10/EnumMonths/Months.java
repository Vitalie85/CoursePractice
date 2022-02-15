package homeWorkLesson10.EnumMonths;
/*Define an enum that will store months of a calendaristic year.  Parse the
        values of this enum, and print to console*/

import java.util.Locale;

public enum Months {
    JANUARY(31, 1, "Winter", "Jan"),
    FEBRUARY(28, 2, "Winter", "Feb"),
    MARCH(31, 3, "Spring", "Mar"),
    APRIL(30, 4, "Spring", "Apr"),
    MAY(31, 5, "Spring", "May"),
    JUNE(30, 6, "Summer", "Jun"),
    JULY(31, 7, "Summer", "Jul"),
    AUGUST(31, 8, "Summer", "Aug"),
    SEPTEMBER(30, 9, "Autumn", "Sep"),
    OCTOBER(31, 10, "Autumn", "Oct"),
    NOVEMBER(30, 11, "Autumn", "Nov"),
    DECEMBER(31, 12, "Summer", "Dec");
private final int daysInMonth;
private final int monthNumber;
private final String season;
private final String acronym;
    private Months(int daysInMonth, int monthNumber, String season, String acronym){
            this.daysInMonth = daysInMonth;
            this.monthNumber = monthNumber;
            this.season = season;
            this.acronym = acronym;

    }
    public int getDaysInMonth(){
        return daysInMonth;
    }
    public int getMonthNumber(){
        return monthNumber;
    }

    public String getSeason() {
        return season;
    }

    public String getAcronym() {
        return acronym;
    }
}
class TestMonths {
    public static void main(String[] args) {
        System.out.println("Month \t Days in month \t Month number \t\t Season \t\t Acronym");
        for (Months months : Months.values()) {
            if (months.getDaysInMonth() > 30) {
                if (months.getSeason() == "Autumn") {
                    System.out.printf("%-10s \t %-10s \t %-10s \t %-10s \t %-10s \n", months, months.getDaysInMonth(), months.getMonthNumber(), months.getSeason(), months.getAcronym());
                }
            }
        }
        System.out.println(Months.JANUARY.getDaysInMonth());
    }
}