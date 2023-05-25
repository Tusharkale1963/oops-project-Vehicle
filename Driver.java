package com.LCRP_Architectur;
// Loose coupling & runtime Polymorphism

public class Driver {
	           //Loose coupling 
	void driver(Vehicle v) {
		// runtime polymorphism
		v.breaks();
		v.engine();
	}
}
