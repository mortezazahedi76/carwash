package Carwash;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String input = new Scanner(System.in).nextLine();
            System.out.println(Reserve.service(input));
        }
    }
}
