package Carwash;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class Reserve {
    final int nezafat = 20;
    final int rooshooyi = 15;
    final int sefrshooyi = 60;

    static int fistDay = 1;
    static int firstHour = 9;
    static int firsMinute = 0;
    public static ArrayList <Date> dates = new ArrayList<>();





    public static String service (String input){
        String[] arrOfStr = input.split(" ");
        String item0 = arrOfStr[0];
        String item1 = arrOfStr[1];
        if (item0.equals("reserve"))
            if (item1.equals("earliest") )
                return Earliest(input);
            else
                return CustomTime(input);
        else
            return item0;
    }
    public static String Earliest (String input){

        String[] arr = input.split(" ");
        String item0 = arr[2];

        if (item0.indexOf('+')>0) {
            if(item0.indexOf('+')>1) {
                String[] arr1 = item0.split("\\+");
            }
            else {
                String[] arr1 = item0.split("\\+");
            }
        }
        else {
            if (item0.equals("nezafat")){

            }

        }


        return item0;
    }
    public static String CustomTime(String input){
        String[] arr = input.split(" ");
        String Day = arr[1];
        String[] time = arr[2].split(":");
        String hour = time[1];
        String minutes = time[2];
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(Day));
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hour));
        calendar.set(Calendar.MINUTE, Integer.parseInt(minutes));
        Date date = calendar.getTime();
        dates.add(date);
        Collections.sort(dates);



        return dates.toString();
    }




}
