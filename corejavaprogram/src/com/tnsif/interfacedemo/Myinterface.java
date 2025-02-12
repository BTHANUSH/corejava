package com.tnsif.interfacedemo;
// demo for nested interface
public interface Myinterface {
	void calucatearea();
	
	interface Myinnerinterface {
		int id=30;
		void print();
	}

}
