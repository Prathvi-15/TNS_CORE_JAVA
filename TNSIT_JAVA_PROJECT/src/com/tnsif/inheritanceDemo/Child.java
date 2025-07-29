package com.tnsif.inheritanceDemo;

public class Child extends Father{
	String cycle="pimk falsh";
	public static void main(String[] args) {
		
		Child c= new Child();
		System.out.println(c.car);
		System.out.println(c.money);
		System.out.println(c.cycle);
		c.drinking();
		c.reading();
		
	}

}
