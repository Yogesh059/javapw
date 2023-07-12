import java.util.Scanner;

public class Multiply
{

public static void main(String[] arg) 
    {

         int num1, num2,  Product;
         Scanner sc = new Scanner(System.in);

         System. out. println("Enter First  Number: ");
         num1 = sc.nextInt();

         System. out. println("Enter Second  Number: ");
         num2 = sc.nextInt();

         sc.close();
         Product = num1 * num2;
         System. out. println("multiplication of the two numbers: "+ Product);
     }
}