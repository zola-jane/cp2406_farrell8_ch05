/*
 * Created by Zola on 22/08/2016.
 */
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer >>>");
        num = input.nextInt();
        if (num%2 == 1)
            System.out.println("The number " + num + " is odd");
        else
            System.out.println("The number " + num + " is even");
    }
}
