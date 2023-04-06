import java.util.Scanner;

public class Natural_NoLimit

{
    Scanner scanner=new Scanner(System.in);


    public void Limit ()
    {
        int sum=0; //to store/transfer value
        System.out.println("Please input a natural number so that we can display them " +
                            "and their sum until your input");
             int n= scanner.nextInt();

        System.out.println("The Natural Numbers are:");
        for (int i = 1; i <=n ; i++)
        {

            System.out.println(i);



        }for (int j = 1; j <=n ; j++)
    {
        sum=sum +j;


    }
        System.out.println("Sum of your input is:" + sum);

    }

    public static void main(String[] args)
    {
        Natural_NoLimit naturalNoLimit= new Natural_NoLimit();
        naturalNoLimit.Limit();
    }

}

