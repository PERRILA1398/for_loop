
 import java.util.Scanner; //importing java scanner


public class SumOf_PositiveInt //public class
{
    //new scanner object
 Scanner scanner= new Scanner(System.in); //system.in to get input from the user


 public  void Integer() //nonstatic method
 {
     System.out.println("Please input a positive integer while we calculate the sum of your input in the following " +
            " series 1 +1/2+ 1/3...until your input number"); //to get the value of n
     int n= scanner.nextInt(); //user input or value of n
      double sum=0.0; //new variable to store the value of the sum


     for (int i = 1; i <=n ; i++)
     {
         //formula to get the sum of n in 1+1/2+1/3...series
         sum = sum + 1.0 / i; //1.0 double type because it is a fraction so that java can print double value
         ;
         //if else to set a condition to print the output only if it is a positive integer else invalid
     }if (n > 1)
         {
             System.out.println("The sum of your input is :" +" "+ sum);

         }else
             System.out.println("Please choose a positive integer");

 }

    public static void main(String[] args) //main method
    {
        SumOf_PositiveInt sum = new SumOf_PositiveInt(); //new public class object
        sum.Integer(); // calling in to static main method from nonstatic

    }

}
