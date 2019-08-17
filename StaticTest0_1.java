class StaticTest0_1  
{
	static int a=m1();
	static int m1()
	{
		System.out.println("variable a is create");
		return 50;
	}
	public static void main(String[] args) 
	{
		System.out.println("a:"+a);

	}
}
