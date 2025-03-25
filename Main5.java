package Abstraction;
import java.util.*;
public class Main5
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the vechical to ride\n vechicals available are Bike,Auto,Cab");
	String vechical=sc.next();
	Rapido1 r=Factory.Factoryvehical(vechical);
	if(r!=null)
	{
		r.stsrt_ride();
		r.continue_ride();
		r.end_ride();
	}
	else
	{
		System.out.println(vechical+"is not available");
	}
}
}
