import java.util.Scanner;

public class Reverse // public class
{
 Scanner scanner= new Scanner(System.in); // to import java scanner
public void Reversing() //nonstatic method
  {
    System.out.println("Please input any numbers so that we can reverse it"); //requesting input from user
    int num = scanner.nextInt(); //user input variable

    for (int i = 0; num > 0; ) //setting a condition that number should be greater than zero

    {
        int new_var = num % 10; // new variable = user input % 10 to achieve the last digit of the user input
        i = i * 10 + new_var;   // new value of i=0*10+last digit of user input

        num = num / 10;    //new user input value = user input divided by 10
        //repeating the process will give us the reverse of user input as 'i' value

        System.out.println(i); // printing i value

    }




  }

    public static void main (String [] args) //calling static main method
    {
        Reverse reverse = new Reverse(); //new object
        reverse.Reversing(); //main method


    }



}




