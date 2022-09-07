import java.util.Scanner;
class multiplication1
{
  public static void main(String[] args)
  {
	  Scanner scr = new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num = scr.nextInt();
    

	for(int i=1; i<=10; i++)
	{
	   int div = num * i;
	   System.out.println(num + "*" + i + "=" + div);
	}
  }
}