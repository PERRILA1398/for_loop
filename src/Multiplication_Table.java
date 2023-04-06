

public class Multiplication_Table //public class
{


    public void Table () //nonstatic method
        {

            int num=3; // number whose table will be printed in the output
            int a=0; //new variable

            System.out.println("Below is the table of number 3 until 12 : "); //will print the command

            for (int i = 1; i <= 12; i++) //given 'i' value 1 and a condition
                //if condition is matched then 'i' value increments by 1 each time and for loop executes until 12

            {
                 a= num*i; //formula for multiplication

                System.out.println( num + " " + "* " + i + "=" +" "+ a); //a value is printed with given strings

            }

        }

        public static void main (String []args) //main method
        {
            Multiplication_Table multiplicationTable = new Multiplication_Table(); //new public class object
            multiplicationTable.Table(); //nonstatic called into static main method

        }
}
