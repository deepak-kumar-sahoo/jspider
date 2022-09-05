class fibonacci
{
  public static void main(String[] args)
  {
    int a = 0;
	int b = 1;

	int num = 1;
    int n = 20;
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