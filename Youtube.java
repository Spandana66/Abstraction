package com.Abstract;

 abstract public class Youtube
{
abstract public void play();
}
 class T_Series extends Youtube
 {
	 public void play()
	 {
		 System.out.println("T_series video played");
	 }
	 public static void main(String[] args) 
	 {
		Youtube y1=new T_Series();
		y1.play();
	}
 }
