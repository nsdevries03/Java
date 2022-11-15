public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public Date(Date other) {
        this(other.year, other.month, other.day);
    }
    public int getDaysInMonth() {
        if (month == 9 || month == 4 || month == 6 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 31;
        }
    }
    public int getDaysInYear() {
        if (isLeapYear()) {
            return 366;
        } else {
            return 365;
        }
    }
    public boolean isLeapYear() {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    public void nextDay() {
        day++;
        if (day > getDaysInMonth()) {
            month++;
            day = 1;
            if (month > 12) {
                month = 1;
            }
        }
    }
    public int daysBetween(Date other) {
        int count = 0;
        if (before(other)) {
            Date temp = new Date(this);
            while (temp.year != other.year || temp.month != other.month || temp.day != other.day) {
                temp.nextDay();
                count++;
            }
        }
        return count;
    }
    public boolean before(Date other) {
        return year < other.year || (year == other.year && (month < other.month || month == other.month && day < other.day));
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int day) {
        if (day < 1 || day > getDaysInMonth()) {
            throw new IllegalArgumentException("Illegal day: " + day);
        }
    }
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Illegal month: " + month);
        }
    }
    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Illegal year: " + year);
        }
    }
}
