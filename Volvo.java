package com.LCRP_Architectur;
//inheritance + polymorphism + encapsulation

//full impelemenation

public class Volvo extends Bus {
	@Override
	public void engine() {
		System.out.println("Volvo engine capacity 110 KMPH");
	}

	@Override
	public void breaks() {
		System.out.println("Volvo needs powerful beaks");
	}
}
/*
 * In Volvo class we have overridden breaks() method because Volvo needs more
 * powerful breaks
 */