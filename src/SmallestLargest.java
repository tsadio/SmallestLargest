import java.util.Scanner;

public class SmallestLargest {
    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Input the 1st number: ");
        num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        num3 = in.nextInt();


        if ((num1 > num2) && (num1 > num3) )
            System.out.println("The largest number is: " + num1);
        else if ((num2 > num1) && (num2 > num3))
            System.out.println("The largest number is: " + num2);
        else
            System.out.println("The largest number is: " + num3);

        if ((num1 < num2) && (num1 < num3) )
            System.out.println("The smallest number is: " + num1);
        else if ((num2 < num1) && (num2 < num3))
            System.out.println("The smallest number is: " + num2);
        else
            System.out.println("The smallest number is: " + num3);
    }
}
