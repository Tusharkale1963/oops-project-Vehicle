package com.LCRP_Architectur;

// Full Abstraction 
public interface Vehicle {
	void engine();

	void breaks();
}
/*
 * We have created Vehicle by using interface Wand its operations by using
 * abstract methods, because every vehicle will have different implemetation to
 * above two operations, we have declared them as abstract methods, for forcing
 * implemation classes(sub type) developers to implement there two methods To
 * according to their requirements and to support mutliple type inheritance
 *
 * 
 */