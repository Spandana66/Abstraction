package Abstraction;

public class Bike implements Rapido1
{
public void start_ride()
{
	System.out.println("Bike reached the starting location");
}
public void continue_ride()
{
	System.out.println("ride continued on Bike");
}
public void end_ride()
{
	System.out.println("Arraived to destination on Bike");
}
}
