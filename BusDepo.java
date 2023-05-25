package com.LCRP_Architectur;

// message passing 
public class BusDepo {

	public static void main(String[] args) {
		Driver tushar = new Driver(); // message passing
		//tushar.driver(new RedBus());
		 tushar.driver(new Volvo());
	}

}
/*This project is not 100% Loosely coupled
becasue we must modify BusDepo class code
every time when we need to change one
sub class to another sub class object.
to make this BusDepo class also loosely coupled
with sub types, we must read sub types names 
either from keyboard or from properties file or from 
xml file, then we must load sub type class byte code

*/