public class Fibonacci // java public class

  {


      public static void main(String [] args) // static main method
        {
            int num1= 0; //new variable
            int num2= 1; //new variable

            System.out.println("Series of Fibonacci numbers of 10");

            //giving a variable value and setting a condition
            // if condition matches then for loop keeps on executing until 10
            for (int i = 1; i <=10; i++) // for loop to increment the value of i until 10



            {
                // adding the values and storing the result to the current value
                int sum= num1 + num2;

                num1=num2;
                num2=sum;




                System.out.println( sum ); //printing the output and value of sum





            }
        }





  }



