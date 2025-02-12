package com.tnsif.multithreading;

public class Eclip implements Runnable {
public void run() {
for(int i=0;i<5;i++)
System.out.println("Eclip  "+ Thread.currentThread().getId());
}
}
class Flipcart implements Runnable {
public void run() {
System.out.println("Flipcart    "+ Thread.currentThread().getId());
}
} 
