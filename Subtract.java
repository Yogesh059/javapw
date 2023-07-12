import java.util.Scanner;

public class Subtraction
{

public static void main(String[] arg) 
    {

         int num1, num2,  difference;
         Scanner sc = new Scanner(System.in);

         System. out. println("Enter First  Number: ");
         num1 = sc.nextInt();

         System. out. println("Enter Second  Number: ");
         num2 = sc.nextInt();

         sc.close();
         difference = num1 - num2;
         System. out. println("Difference of the two numbers: "+difference);
     }
}