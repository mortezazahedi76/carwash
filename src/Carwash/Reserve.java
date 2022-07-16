package Carwash;

public class Reserve {

    public static String service (String input){
        String[] arrOfStr = input.split(" ");
        String item0 = arrOfStr[0];
        String item1 = arrOfStr[1];
        if (item0 == "reserve")
            if (item1 == "earliest")
                return Earliest(input);
            else
                return PrivetTime(input);
        else
            return "ERR";
    }
    public static String Earliest (String input){
        String[] arr = input.split(" ");
        String item0 = arr[3];


        return item0;
    }
    public static String PrivetTime(String input){

        return input;
    }
}
