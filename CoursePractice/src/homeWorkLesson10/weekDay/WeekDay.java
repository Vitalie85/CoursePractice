package homeWorkLesson9.homeWorkLesson10.weekDay;
/*Create a enum named Weekday that would keep the days of the week:
        MONDAY, TUESDAY... SUNDAY. Define two methods in the enumeration: isWeekDay () and
        isHoliday (), both of the boolean return type, which must indicate whether the value in the
        enumeration, on which one of these methods was invoked, is a business day or a weekend
        day. For example, the next call should display true.
        System.out.println(Weekday.MONDAY.isWeekday());  // true*/

public enum WeekDay {
    MONDAY("business day"),
    TUESDAY("business day"),
    WEDNESDAY("business day"),
    THURSDAY("business day"),
    FRIDAY("business day"),
    SATURDAY("weekend"),
    SUNDAY("weekend");
    private final String daysOfWeek;

    private WeekDay(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public boolean isWeekDay() {
         if(daysOfWeek == "business day"){
             return true;
        }
         return false;
    }

    public boolean isHoliday() {
        if(daysOfWeek == "weekend") {
            return true;
        }
        return false;
    }
}
class TestWeekDays{
    public static void main(String[] args) {
        System.out.println(WeekDay.MONDAY.isWeekDay());
        System.out.println(WeekDay.SUNDAY.isHoliday());
        System.out.println(WeekDay.SATURDAY.isWeekDay());
        System.out.println(WeekDay.TUESDAY.isHoliday());
    }
}