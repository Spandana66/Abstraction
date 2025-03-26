package Abstraction;

public class Demo 
{
static Demo d=null;
private Demo()
{
	System.out.println("Demo constractor called");
}
public static Demo obj()
{
	if(d==null)
	{
		d=new Demo();
	}
	return d;
}
}
