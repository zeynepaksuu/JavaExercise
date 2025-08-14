package Week5.Homeworks.WeekEnums;

public enum Day {
    MONDAY("9:00 - 17:00"),
    TUESDAY("9:00 - 17:00"),
    WEDNESDAY("9:00 - 17:00"),
    THURSDAY("9:00 - 17:00"),
    FRIDAY("9:00 - 17:00"),
    SATURDAY("9:00 - 12:00"),
    SUNDAY("Closed");

    private final String hours;

    Day(String hours) {
        this.hours = hours;
    }

    public String getHours() {
        return hours;
    }
}
