package com.imooc;

public class PassagerCar extends cars{
	public PassagerCar(String name, int price, int peopleCapacity) {
		this.name=name;
		this.price=price;
		this.peopleCapacity=peopleCapacity;
	}

	public int getPeopleCapacity(){
		return peopleCapacity;
	}
}
