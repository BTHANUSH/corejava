package com.tnsif.polymorphism;

public class Car extends Vechicle {
	   public void move() {
			
		      System.out.println("car drives");
		}
		
		void display() {
			 //super.move();
			move();
		}
		public static void main(String[] args){
		Car c=new Car();
		//c.Move();
		c.display();
	}	
		
}