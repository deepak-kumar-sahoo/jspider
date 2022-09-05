import java.util.Scanner;
class fibonacci1
{
  public static void main(String[] args)
  {
     Scanner scr = new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int n = scr.nextInt();

	 int a = 0;
	 int b = 1;
	 int num = 1;

	 while(num<=n)
	 { 
	   System.out.println("Value of a:" + a);

	   int c = a + b;
       a = b;
	   b = c;

	   num++;
	 }
  }
}