package Carwash;

public class DateHandler {
    public int Day;
    public int minutes;
    public int hours;

    public DateHandler(int Day, int hour, int minutes){
        this.Day = Day;
        this.hours = hour;
        this.minutes = minutes;
    }

    public String toString()
    {
        return "Day: "+Day+" Minutes: "+minutes+" Hours: "+hours;
    }




}
