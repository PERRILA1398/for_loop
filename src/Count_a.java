import java.util.Scanner;

public class Count_a {
    Scanner scanner = new Scanner(System.in);

    public void Name() {
        int count = 0;


        System.out.println("Please write any sentence to count the number of a's in it");
        String sentence = scanner.next();


        for (int i = 0; i < sentence.length(); i++)
        {

            if (sentence.charAt(i)=='a')
            {
                count ++;


            }



        }  System.out.println("The number of a's in the sentence are:" + count);


    }


    public static void main(String[] args)
    {

        Count_a count_a= new Count_a();
        count_a.Name();
    }
}
