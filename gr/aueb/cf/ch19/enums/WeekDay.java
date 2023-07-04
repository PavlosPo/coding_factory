package gr.aueb.cf.ch19.enums;

public enum WeekDay {
    // instances of enum Weekday
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Thursday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private final String day;

    // We don't give access to Instantiate WeekDay enums, java does it.
    private WeekDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
