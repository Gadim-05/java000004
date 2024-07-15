import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;
public class TimeCalculator {
    void calculateDifference(int hour1, int minute1, int hour2, int minute2){
        int hour  = Math.abs(hour2-hour1);
        int minute = Math.abs(minute2-minute1);
        System.out.println("There is " + hour + " hour " + minute + " minutes difference.");
    }

    void calculateDifference(String time1, String time2){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");


        LocalTime t1 = LocalTime.parse(time1,formatter);
        LocalTime t2 = LocalTime.parse(time2,formatter);

        int difference = (int) ChronoUnit.MINUTES.between(t1,t2);

        int hour =  difference/60;
        int minute = difference%60;
        System.out.println( Math.abs(hour) + " Hour " + Math.abs(minute) + " minute");


    }



}
