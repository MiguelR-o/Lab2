package models;

import java.time.LocalDate;
import java.time.format.*;

public class BirthDate {
    private String date;

    BirthDate(String date) {
        this.date = date;
    }

    public int getAge() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        int year = getBirthYear();
        int month = getBirthMonth();
        int day = getBirthDay();

        LocalDate todayDate = LocalDate.now();
        String formatedDate = dtf.format(todayDate);

        String[] dates2 = formatedDate.split(" ", 5);
        int year2 = Integer.parseInt(dates2[0]);
        int month2 = Integer.parseInt(dates2[1]);
        int day2 = Integer.parseInt(dates2[2]);

        if (month2 <= month && day2 <= day) {
            return (year - year2);
        } else {
            return (year - year2) - 1;
        }

    }

    public String getBirthDate() {
        return this.date;
    }

    public int getBirthDay() {
        String[] dates = this.date.split(" ", 5);
        int day = Integer.parseInt(dates[2]);
        return day;
    }

    public int getBirthMonth() {
        String[] dates = this.date.split(" ", 5);
        int month = Integer.parseInt(dates[1]);
        return month;
    }

    public int getBirthYear() {
        String[] dates = this.date.split(" ", 5);
        int year = Integer.parseInt(dates[0]);
        return year;
    }
}
