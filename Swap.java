class Swap
{
	public static void main(String args[])
	{
		System.out.print("Enter the value of a:");
		int a=Integer.parseInt(System.console().readLine());
		System.out.print("Enter the value of b:");
		int b=Integer.parseInt(System.console().readLine());
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swap value of a is " +a);
		System.out.println("Swap value of b is " +b);
	}
}

		