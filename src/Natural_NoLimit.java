import java.util.Scanner; //importing scanner from java

public class Natural_NoLimit //public class

{
    //scanner to scan user input
    Scanner scanner=new Scanner(System.in);  //system.in gets input from the user

    //nonstatic method
    public void Limit ()
    {
        int sum=0; //to store/transfer value
        System.out.println("Please input a natural number so that we can display them " +
                            "and their sum until your input"); //requesting user input
             int n= scanner.nextInt(); //n value is user input

        System.out.println("The Natural Numbers are:");
        for (int i = 1; i <=n ; i++) //prints all the numbers from 1-n
        {

            System.out.println(i);



        }for (int j = 1; j <=n ; j++)
    {
        //gets the sum total of n as j increments until n value
        sum=sum +j; //sum of n = total sum of all numbers added until n value


    }
        System.out.println("Sum of your input is:" + sum); // output , result

    }

    public static void main(String[] args) //calling in static main method
    {
        Natural_NoLimit naturalNoLimit= new Natural_NoLimit(); //calling in new object
        naturalNoLimit.Limit(); //nonstatic to static main method
    }

}

