class sumofdigit
{
	public static void main(String[] args)
	{
	  int num = 128;
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