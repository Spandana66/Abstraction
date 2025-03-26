package Abstraction;

public class Main3 
{
public static void main(String[] args)
{
	Atm a1=new SBI();
	Atm a2=new HDFC();
	a1.balance();
	a1.withdraw();
	a2.balance();
	a2.withdraw();
}
}
