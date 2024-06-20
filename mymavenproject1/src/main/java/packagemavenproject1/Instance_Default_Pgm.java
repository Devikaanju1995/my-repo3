package packagemavenproject1;



public class Instance_Default_Pgm 
{
	int c;
	int a=100;
	int b=2;
	public void div() 
	{

	c=a/b;
	System.out.println("the result is : " +c);
	}
	public static void main(String[] args) 
	{
		Instance_Default_Pgm obj=new Instance_Default_Pgm();
		obj.div();

	}

}

