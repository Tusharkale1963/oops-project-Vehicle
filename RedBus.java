package com.LCRP_Architectur;
//inheriatance+ploymorphism + encapsulation
//full implementation

public class RedBus extends Bus {
	@Override
	public void engine(){
		System.out.println("RB engine capacity 40KMPH");
		}
}
/*
We have created RedBus by using
concrete class because all operations 
Recorded with top of Vehicle object are implemented in this class
as per this sub type ResdBus requirement*/