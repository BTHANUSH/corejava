package com.tnsif.polymorphism;

public class point {
	
    private float X;
    private float Y;

	public point() {
		X=9.0f;
		Y=8.0f;
	}
	public point(float f) {
		this.X=Y;
		Y=6.5f;
	}
	public point(float X, float Y) {
		this.X=X;
		this.Y=Y;
	}
	public static void main(String[] args) {
		point p=new point();
		System.out.println(p);
		point p1=new point(7f);
		System.out.println(p1);
		point p2=new point(5.6f,8.2f);
	    System.out.println(p2);
	
	
	}
} 