import java.util.Scanner; //to import java scanner

public class NaturalNo_Sum
        //new public class


{

    Scanner scanner= new Scanner(System.in); // system.in gets input from the user

    public void Natural() //nonstatic method

    {
        //s.out to print your request to get  user input
        System.out.println("Please enter any natural number so that we can print the sum of it");
        int num= scanner.nextInt(); //num= user input
        int new_num=0; //to store new num value everytime it gets changed

        for (int i = 1; i <= num ; i++) //for loop to increment the value of i until user input
        {
            new_num= new_num +i; //formula to get the sum of  user input
            //0=0+1=1, 1=1+2=3, 3=3+3=6, 6=6+4=10 until user input that gives us the sum of user input
        }
        System.out.println( "The sum of your input is: " +" "+ new_num); //prints new_num value

    }

    public static void main (String []args)
    {
        NaturalNo_Sum naturalNumber= new NaturalNo_Sum();
        naturalNumber.Natural();

    }

}
