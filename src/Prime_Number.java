import java.util.Scanner; //importing java scanner

public class Prime_Number //public class
{

    Scanner scanner = new Scanner(System.in); // to get input from the system

    public void Number() //nonstatic method
    {
        //prints request to the user to enter an input
        System.out.println("Please input any number to know if it is prime number or not");

        int user_in = scanner.nextInt(); //user input


        int count = 0; // to count how many times the number gets divided


        // if the condition matches then for loop will keep on executing until user input
        for (int i = 1; i <= user_in; i++) //for loop to increment the value of i until user input
        {
            //if statement is used if there is a condition involved,() holds the condition
            if (user_in % i == 0) //to check if number is divisible by 1
            {

                count++;//to count how many times the number is getting divided

            }
        }
           //prime number is only divisible twice
        if (count == 2) //if number is divided twice then it is a prime number
        {

            System.out.println("Prime Number");
        }else //if divided more than twice then not a prime number

        {
            System.out.println("Not a Prime Number");
        }
    }
    public static void main (String []args){ //calling static main method

        Prime_Number prime_number= new Prime_Number();
        prime_number.Number();
    }
}
