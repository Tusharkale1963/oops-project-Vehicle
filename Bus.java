package com.LCRP_Architectur;

//abstraction + inheritance + polymorphism + encapsulation
// partical abstraction
abstract class Bus implements Vehicle {
	@Override
	public void breaks() {
		System.out.println("bus has normal breaks ");
	}

}
/*
 * 
 * We have created Bus by using abstarct class because one of the
 * operations engine() inheriting from Vehicle can not be implemented, 
 * because with Top Screen Rec
 * its implimentation will be changed from one type of bus to another type
 * of bus Because Bus class contains both concrete method breaks() and
 * abstract method engine(), we must declare Bus class as abstract class
 */