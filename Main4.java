package Abstraction;

public class Main4 
{
public static void main(String[] args)
{
	Hierarchical g=new Gpay();
	Hierarchical p=new Phonepay();
	g.balance();
	g.deductmoney();
	g.addmoney();
	p.balance();
	p.deductmoney();
	p.addmoney();
}
}
