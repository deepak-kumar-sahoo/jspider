import java.util.Scanner;
class primenumber
{
  public static void main(String[] args)
  {
     Scanner scr = new Scanner(System.in);
	 System.out.println("Enter the number");
	int num = scr.nextInt();

	Boolean flag = true;

	for(int i=2; i<=num/2; i++)
	{
	   if(num%i==0)
		{
	     flag = false;
		 System.out.println("num is not prime no.");
		 break;
		}
		
	}
	

	if(flag) System.out.println("num is a prime no.");
  }
}