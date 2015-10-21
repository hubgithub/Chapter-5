import java.util.Scanner;
public class LeapYear
{

    public static void main(String []arg)
    {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.print("What is the year? :");
        year = scan.nextInt();
        
        if (year > 1582 &&(year%400 == 0 || year%4 == 0 && year%100 != 0))
        {
            System.out.println("This year is Leap Year");
        }
        else
        {
            System.out.println("This year is not Leap Year");
        }
    }

}
