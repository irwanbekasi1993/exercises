package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDateExercise {
    public static void main(String[] args) {
        getDate("2022-11-22");
        getDateAndTime("2022-11-22T12:34");
        customFormat("03 Apr 2011","dd MMM yyyy");
    }
    static void getDate(String date){
        LocalDate ld = LocalDate.parse(date);
        System.out.println(ld);
    }
    static void getDateAndTime(String dateTime){
        LocalDateTime ldt = LocalDateTime.parse(dateTime);
        System.out.println(ldt);
    }

    static void customFormat(String date, String format){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDate random = LocalDate.parse(date,dtf);
        System.out.println(date+","+random);
    }
}
