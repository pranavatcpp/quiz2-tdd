import java.util.Arrays;

public class DateChecker {
    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private Month[] monthThirtyOneDays = {
        Month.JANUARY, Month.MARCH, Month.MAY,
        Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER
    };

    private Month[] monthThirtyDays = {
        Month.APRIL, Month.JUNE, Month.SEPTEMBER, Month.NOVEMBER
    };

    public boolean has30Days(Month month) {
        if (Arrays.asList(monthThirtyDays).contains(month)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean has31Days(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }

        if (Arrays.asList(monthThirtyOneDays).contains(month)) {
            return true;
        } else {
            return false;
        }
    }
}
