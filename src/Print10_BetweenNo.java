
//importing java scanner

import java.util.Scanner;


public class Print10_BetweenNo // public class
  {
    Scanner scanner =new Scanner (System.in); //new scanner object //system.in to get the user input


    public void Number10 () //nonstatic method

    {
        System.out.println("Please enter two numbers so that we can print 10 numbers between them eg 10-20");
        System.out.println("Please input your first number ");
        int number1= scanner.nextInt(); //requesting input from the user

        System.out.println("Please input your second number");
        int number2= scanner.nextInt(); //requesting input from the user

        // method to print numbers between user input
        //if input number1 is smaller or equals than input 2
        // then the numbers between input1-2 are printed using for loop i++

        for (int i = number1; i <=number2; i++) //for loop to increment the value of i=number1 until number2
        {
            //to print out the numbers between the inputs
             System.out.println(i);
        }




    }

     public static void main (String []args){ //calling static main method

       Print10_BetweenNo printNo10 = new Print10_BetweenNo(); // adding new object to call it into main method
       printNo10.Number10(); //main method
    }
}

