public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 2;
        month = 12;
        year = 2023;
    }

    public Date(int day, int month, int year) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }
        if (month > 0 && month <= 12) {
            this.month = month;
        }
        if (year <= 2023 && year >= 2000) {
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year <= 2023 && year >= 2000) {
            this.year = year;
        }
    }

    public void display() {
        System.out.println(" Date : " + day + "-" + month + "-" + year);
    }
}

