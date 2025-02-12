 package com.tnsif.interfacedemo;

public class Demointerface implements Childinterface,Interfaceone {

	@Override
	public void print() {
		System.out.println("print");
		
	}

	@Override
	public void show() {
		System.out.println("show");
		
	}
	public static void main(String[] args) {
		Demointerface t=new Demointerface();
	t.print();
	t.show();
	}
	

}
 