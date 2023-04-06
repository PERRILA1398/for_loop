import java.util.Scanner;

public class Switch_Month
{
    Scanner scanner = new Scanner(System.in);

    public void Months()
    {
        String jan = "January";
        String feb = "February";
        String march = "March";
        String april = "April";
        String may = "May";
        String june = "June";
        String july = "July";
        String aug = "August";
        String sep = "September";
        String oct = "October";
        String nov = "November";
        String dec = "December";

        System.out.println("Please put any number from 1-12 to check which month falls under that number:");
        int number = scanner.nextInt();

        switch (number)
        {

            case (1):
                System.out.println("The month is :" + jan);
                break;
            case (2):
                System.out.println("The month is :" + feb);
                break;
            case (3):
                System.out.println("The month is :" + march);
                break;
            case (4):
                System.out.println("The month is :" + april);
                break;
            case (5):
                System.out.println("The month is :" + may);
                break;
            case (6):
                System.out.println("The month is :" + june);
                break;
            case (7):
                System.out.println("The month is :" + july);
                break;
            case (8):
                System.out.println("The month is :" + aug);
                break;
            case (9):
                System.out.println("The month is :" + sep);
                break;
            case (10):
                System.out.println("The month is :" + oct);
                break;
            case (11):
                System.out.println("The month is :" + nov);
                break;
            case (12):
                System.out.println("The month is :" + dec);
                break;
            default:
                System.out.println("Sorry but there are only 12 months in a year, please try numbers 1-12");


        }



    }

    public static void main (String []args)
    {
        Switch_Month switch_month= new Switch_Month();
        switch_month.Months();

    }

}
