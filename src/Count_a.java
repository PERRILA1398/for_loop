import java.util.Scanner; //to import java scanner

public class Count_a { //public class
    Scanner scanner = new Scanner(System.in); //scans input from user ,system.in gets input from user

    //nonstatic method
    public void Name() {
        int count = 0; //int count to count the value


        System.out.println("Please write any sentence to count the number of a's in it");//requesting user input
        String sentence = scanner.nextLine(); //sentence= user string input

        //for loop condition is set, 'i' should be smaller than string length
        for (int i = 0; i < sentence.length(); i++) //if condition is matched than 'i' value increments until
            //string length
        {

            if (sentence.charAt(i)=='a') //checks character in the sentence is equal to a or not
            {
                count ++; //if true then it counts the number of a's in the sentence


            }



        }
           //prints the total number of a's in the sentence with the given string message
           System.out.println("The number of a's in the sentence are:" + count);


    }


    public static void main(String[] args) //calling in static main method
    {

        Count_a count_a= new Count_a(); //new public class object
        count_a.Name(); //from nonstatic to static main method
    }
}
