package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/19/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.util.Calendar;
import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month;
        int day;
        int year;

        System.out.println("What is the month you were born: ");
        month = input.nextInt();

        System.out.println("What is the day that you were born in the month: ");
        day = input.nextInt();

        System.out.println("What is the year that you were born in the month: ");
        year = input.nextInt();


        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month, day);

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        System.out.println("We are " + dayOfYear + " days from your birthday!");

    }









}
