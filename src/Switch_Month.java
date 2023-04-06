import java.util.Scanner; //importing java scanner

//public class
public class Switch_Month
{
    Scanner scanner = new Scanner(System.in); //to scan input from the user

    public void Months() //nonstatic method
    {
        //string variables
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

        //requesting user input
        System.out.println("Please put any number from 1-12 to check which month falls under that number:");
        int number = scanner.nextInt(); //number value= user input

        switch (number) //switch statement to check user input variable match with the cases
        {

            case (1): //if number is 1 then case 1 will be printed and so on
                System.out.println("The month is :" + jan);
                break; //to stop the case and start another one
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

                //if user input doesn't match any of the above,rest is invalid and a default message will be printed
            default:
                System.out.println("Sorry but there are only 12 months in a year, please try numbers 1-12");


        }



    }

    public static void main (String []args) //calling in static main method
    {
        Switch_Month switch_month= new Switch_Month(); //new public class object
        switch_month.Months();//nonstatic to static main method

    }

}
