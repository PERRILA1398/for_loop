import java.util.Scanner; //importing scanner from java

public class Factorial_Value //public class

{
    Scanner scanner =new Scanner (System.in);// system in gets input from the terminal

    //nonstatic method
    public void Factorial () {

        System.out.println("Please input any number to get its factorial value");//requesting input from user
        int user_in = scanner.nextInt();
       double new_value = 1; //new variable

        System.out.println("The factorial value of the given input is as follows:");
        //setting a variable value and condition
       // if condition is matched the for loop keeps on executing until user input
        // 'i' value gets incremented until user input
        for (int i = 1; i <=user_in; i++)
        {
            //new value gets changed every loop
            new_value = i * new_value; //1*1=1, 1*2=2, 2*3=6, 4*6=24, 5*24=120 .....until user input


        }System.out.println(new_value); // printing out the output, factorial value of user input

        }



    public static void main  (String []args) //static main method
    {

        Factorial_Value factorial_value= new Factorial_Value(); //new object
        factorial_value.Factorial(); //main method
    }


}
