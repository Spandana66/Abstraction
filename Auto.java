package Abstraction;

public class Auto implements Rapido1
{
	public void start_ride()
	{
		System.out.println("Auto reached the starting location");
	}
	public void continue_ride()
	{
		System.out.println("ride continued on Auto");
	}
	public void end_ride()
	{
		System.out.println("Arraived to destination on Auto");
	}
}
