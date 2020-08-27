// This program will calculate the day of the year based on input of the year, month and day.
// You can enter any positive year, any of the twelve months and from one to the maximum amount of days
// corresponding to the month you pick.
import java.util.Scanner;
class DayNumber
{
    public static void main (String[] args)
    {
        // variables
        boolean leapYearValue;
        int dayNumberToDate;
        int numDaysMax;

        // user input
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the year using integers (only positive years only)");
        int year = input.nextInt ();
        System.out.println ("Enter the month using intergers || eg 5 = may");
        int month = input.nextInt ();
        System.out.println ("Enter the day using integers");
        int day = input.nextInt ();

        // calling methods
        leapYearValue = isLeapYearOrNot (year);
        numDaysMax = compareMonthTo (month);

        // day calculations
        if (year >= 0)
        {
            if ((month > 0) && (month < 13))
            {
                if ((leapYearValue == true) && (numDaysMax == 50) && (day > 0) && (day < 30))
                {
                    dayNumberToDate = dayNumber (year, month, day, leapYearValue);
                    System.out.println ("Day Number: " + dayNumberToDate);
                }
                else if ((leapYearValue == false) && (numDaysMax == 50) && (day > 0) && (day < 29))
                {
                    dayNumberToDate = dayNumber (year, month, day, leapYearValue);
                    System.out.println ("Day Number: " + dayNumberToDate);
                }
                else if ((numDaysMax == 51) && (day > 0) && (day < 31))
                {
                    dayNumberToDate = dayNumber (year, month, day, leapYearValue);
                    System.out.println ("Day Number: " + dayNumberToDate);
                }
                else if ((numDaysMax == 52) && (day > 0) && (day < 32))
                {
                    dayNumberToDate = dayNumber (year, month, day, leapYearValue);
                    System.out.println ("Day Number: " + dayNumberToDate);
                }
                else
                {
                    System.out.println ("Input(s) is(are) invalid.");
                    System.out.println ("Day Number: ERROR");
                }
            }
            else
            {
                System.out.println ("Input(s) is(are) invalid.");
                System.out.println ("Day Number: ERROR");
            }
        }
        else
        {
            System.out.println ("Input(s) is(are) invalid.");
            System.out.println ("Day Number: ERROR");
        }
    }


    // method to determine the amount of days based on the given month
    public static int dayNumber (int year, int month, int day, boolean leapYearValue)
    {
        int numOfDays = 0;
        if (month == 1)
        {
            numOfDays = 0;
        }
        else if (month == 2)
        {
            numOfDays = 31;
        }
        else if (month == 3)
        {
            numOfDays = 59;
        }
        else if (month == 4)
        {
            numOfDays = 90;
        }
        else if (month == 5)
        {
            numOfDays = 120;
        }
        else if (month == 6)
        {
            numOfDays = 151;
        }
        else if (month == 7)
        {
            numOfDays = 181;
        }
        else if (month == 8)
        {
            numOfDays = 212;
        }
        else if (month == 9)
        {
            numOfDays = 242;
        }
        else if (month == 10)
        {
            numOfDays = 273;
        }
        else if (month == 11)
        {
            numOfDays = 304;
        }
        else if (month == 12)
        {
            numOfDays = 334;
        }
        if ((leapYearValue == true) && (month > 2))
        {
            numOfDays += 1;
        }
        numOfDays += day;
        return numOfDays;
    }


    // method to find out if the year entered is a leap year
    public static boolean isLeapYearOrNot (int year)
    {
        boolean isLeapYear;
        if ((year % 4) == 0)
        {
            isLeapYear = true;
            if ((year % 100) == 0)
                isLeapYear = false;
            if ((year % 400) == 0)
                isLeapYear = true;
        }
        else
            isLeapYear = false;
        return isLeapYear;
    }


    // method to determine how many days there are in that month
    public static int compareMonthTo (int month)
        // numbers are used in the main method to determine max day number for each month
    {
        int outPut = 0;
        if (month == 2)
        {
            outPut = 50;
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            outPut = 52;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            outPut = 51;
        }
        return outPut;
    }
}
