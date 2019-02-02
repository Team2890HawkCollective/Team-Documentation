import java.util.Scanner;

public class TestJava
{



public static void main(String[] args)
{
    double gpa = 0;
    boolean exit = false;
    int count = 0;
    Scanner scan = new Scanner(System.in);
    while(!exit)
    {
        System.out.println("Enter a grade (0.0 - 4.0");
        gpa += scan.nextDouble();
        count++;
        System.out.println("Continue? (Y/N)");
        if(scan.next().equalsIgnoreCase("n"))//This checks to see if the user input is 'n' or 'N'
        {
            exit = true;
        }

    }
    System.out.println("Your GPA is " + gpa/count);
    scan.close();



}


}