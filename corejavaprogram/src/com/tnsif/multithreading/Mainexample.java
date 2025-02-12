package com.tnsif.multithreading;

public class Mainexample {
	public static void main(String[] args) {
		Eclip e=new Eclip();
		Thread obj=new Thread(e);
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		Flipcart f=new Flipcart();
		Thread obj1=new Thread(f);
		obj1.start();
		obj1.setPriority(Thread.MIN_PRIORITY);
	for(int i=0;i<5;i++);
	System.out.println("mainmethod "+Thread.currentThread().getId()); 
	
	}

}
