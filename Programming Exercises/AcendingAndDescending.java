/*
 * Created by Zola on 22/08/2016.
 */
import java.util.Scanner;
public class AcendingAndDescending
{
    public static void main(String[] args)
    {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number>>");
        num1 = input.nextInt();
        System.out.println("Enter second number>>");
        num2 = input.nextInt();
        System.out.println("Enter third number>>");
        num3 = input.nextInt();

        if (num1 > num2 && num2 > num3)
        {
            System.out.println("" + num1 + num2 + num3);
        }
        else
            if (num1 > num2 && num3 > num2)
            {
                System.out.println("" + num1 + num3 + num2);
            }
        if (num2 > num1 && num1 > num3 && num1 < num2)
        {
            System.out.println("" + num2 + num1 + num3);
        }
        else {
            if (num2 > num1 && num3 > num1 && num3 < num2)
                System.out.println("" + num2 + num3 + num1);
        }
        if (num3 > num1 && num1 > num2)
        {
            System.out.println("" + num3 + num1 + num2);
        }
        else
        {
            if (num3 > num2 && num2 > num1)
            {
                System.out.println("" + num3 + num2 + num1);
            }
        }
    }
}
