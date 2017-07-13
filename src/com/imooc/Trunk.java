package com.imooc;

public class Trunk extends cars {
	public Trunk(String name,int price,int cargoCapacity){
		this.name=name;
		this.price=price;
		this.cargoCapacity=cargoCapacity;	
	}
	public int getCargoCapacity(){
		return cargoCapacity;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
}
