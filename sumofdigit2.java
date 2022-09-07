import java.util.Scanner;
class sumofdigit2
{
	public static void main(String[] args)
	{
	  Scanner scr = new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num = scr.nextInt();
	  int sum = 0;

	  while(num>0)
	  {
	    int dell = num%10;
		sum = sum + dell;
		num = num/10;
	  }
	  System.out.println("value of sum:" + sum);
	}
}