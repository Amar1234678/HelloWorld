class StaticTest0_2  
{
	static int a;
	static int b;
	static void m1()
	{
		//System.out.println("variable a is create");
		//return 50;
		a=10;
		b=20;
	}
	public static void main(String[] args) 
	{
		System.out.println(a+" "+b);
		m1();
		System.out.println(a+" "+b);

	}
}
