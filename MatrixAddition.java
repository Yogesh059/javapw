import java.util.Scanner;
public class MatrixAddition{

public static  void main(string[] args)
{
System.out.println("please enter the rows in the matrix");
Scanner sc = new scanner(system.in);
int row = sc.nextInt();

System.out.println("please enter the columns in the matrix");
int row = sc.nextInt();

int[][] first = new int[row][column];
int[][] second = new int[row][column];

for(int  r = 0; r < row; r++) 
{
for(int  c = 0; c < column; c++) 
{
System.out.println(string.format("Enter first [%d][%d] integer", r, c));
first[r][c] = sc.nextInt();
}
}
for(int  r = 0; r < row; r++) 
{
for(int  c = 0; c < column; c++) 
{
System.out.println(string.format("Enter Second [%d][%d] integer", r, c));
first[r][c] = sc.nextInt();
}
}
sc.close();

System.out.println("First Matrix :\n");
print2dArray(first);

System.out.println("First Matrix :\n");
print2dArray(first);
}
}
 