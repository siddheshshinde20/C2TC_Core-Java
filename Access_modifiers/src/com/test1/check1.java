package com.test1;

public class check1 {
	public int i = 10;
	public void show() {
		System.out.println("In show method");
	}
public static void main(String args[]) {
	check1 c= new check1();
	c.show();
	System.out.println(c.i);
}
}
