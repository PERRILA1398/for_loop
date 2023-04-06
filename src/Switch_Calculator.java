

import java.util.Scanner; //importing java scanner

public class Switch_Calculator //public class

{
    Scanner scanner= new Scanner(System.in); //system.in gets input from the user

    public void Calculator () //nonstatic method

    {


        System.out.println("Please input any arithmetic operator so that we can calculate two numbers of your choice ");
        char operator= scanner.next().charAt(0);

        System.out.println("Please input your first number"); //requesting user input
        int first_num= scanner.nextInt(); // scanner gets the user input //int value= user input

        System.out.println("Please input your second number");
        int sec_num= scanner.nextInt();



        //new java operator class to call in switch
        int sub= first_num - sec_num;
        int add= first_num + sec_num;
        int div= first_num / sec_num;
        int mod= first_num % sec_num;
        int mul= first_num * sec_num;


        //switch used to execute different case
        switch (operator)
        {
            case '-': //if the input is  - then  case - will be executed
                System.out.println("The subtracted value of the two numbers are" +" " + sub);
                // if input is - then s.out will print sub value

                break; // to end the case and start a new one
            case '+':
                System.out.println("The added value of the two numbers are" +" " + add);
                break;
            case '*':
                System.out.println("The multiplied value of the two numbers are" +" " + mul);
                break;
            case '%':
                System.out.println("The modulus  of the two numbers are" +" " + mod);
                break;
            default: // if none of the above cases match the output then default prints the given value
                System.out.println("The divided value of the two numbers are" +" " + div);





        }

    } public static void main (String []args) // calling in static new method
       {
           //calling in new public class object in main method
           Switch_Calculator switch_calculator= new Switch_Calculator();
           switch_calculator.Calculator(); //main method
       }



}
