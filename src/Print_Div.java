import java.util.Scanner; //importing java scanner

public class Print_Div //public class
{
    //new scanner object in java class
    Scanner scanner = new Scanner(System.in);  //system.in gets input from the user


    public void Divide() //nonstatic method

    {
        System.out.println("Numbers that are divisible by 3 from 1-100 are ");
        //initialise a value
        for (int i = 1; i <= 100; i++) // if condition is matched loop will continue executing until 100
        {
            if (i % 3 == 0) //if is used if there is a condition, () holds the condition
            {
                System.out.println(i); // if condition matches then s.out prints the given variable as output
            }
        }
            System.out.println("Numbers divisible by 5 from 1-100 are");
            for (int j = 0; j <=100 ; j++)
            {

                if (j % 5 == 0)
                {
                    System.out.println(j);
                }

            }



    }

    public static void main (String []args) //calling in main static method
       {

        Print_Div print_div = new Print_Div(); //new public class object
        print_div.Divide(); // nonstatic class to static main method


       }

}
