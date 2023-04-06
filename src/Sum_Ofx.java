public class Sum_Ofx //public class
{

    public static void main(String[] args) //static main method
    {
        int sum=20; //giving sum value 20 as we have to find value of x from 1-20
        int x=0; //new variable to store new value


        for (int i = 1; i <= sum ; i++) //setting a condition, if the condition matches then i.value increments
        {
            x=x+i; //x=0+1=1, X=1+2=3, X=3+3=6' X=6+4=10.....until 20
        }
        System.out.println("The sum of x ranging from 1-20 is:"); //printing string
        System.out.println ( x) ; //output = total sum value of x

    }
}


