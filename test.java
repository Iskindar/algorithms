package com.imooc;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int day;//租车天数
		int []carNum=new int[7];//租车的序号
		String []PassengerCarName=new String[7];
		String []trunkName=new String[7];
		int totalPeopleCapacity=0;//总载人量
		int totalCargoCapacity=0;//总载货量
		int totalPrice=0;//总价格
		cars[] carsForRent={new PassagerCar("奥迪A4",500,4),new PassagerCar("马自达6",400,4),new PickUp("皮卡雪6",450,4,2),new PassagerCar("金龙",800,20),new Trunk("松花江",400,4),new Trunk("依维柯",1000,20)};
		System.out.println("欢迎使用哒哒租车系统");
		System.out.println("1是 0否");
		Scanner in = new Scanner(System.in);   
		int intention=in.nextInt();
		if(intention==0){
			System.out.println("感谢您的使用");
		}else{
			System.out.println("您可租车的类型及其价目表：");
			System.out.println("序号\t汽车名称\t租金\t容量");
			for(int i=1;i<7;i++){
				System.out.print(" "+i+"\t");
				System.out.print(carsForRent[i-1].name+"\t");
				System.out.print(carsForRent[i-1].price+"元/天\t");
				if(carsForRent[i-1] instanceof PassagerCar){
					System.out.print(carsForRent[i-1].peopleCapacity+"人\t");
				}
				else if(carsForRent[i-1] instanceof Trunk){
					System.out.print(carsForRent[i-1].cargoCapacity+"吨\t");	
				}
				else {
					System.out.print(carsForRent[i-1].cargoCapacity+"吨     ");
					System.out.print(carsForRent[i-1].peopleCapacity+"人");
				}
				
				System.out.println();
				
			}
			System.out.println("请输入您要租车的数量");
			int num=in.nextInt();
			int x=0,y=0;
			for(int k=1;k<num+1;k++){
				System.out.println("请输入第"+k+"辆车的序号：");
				carNum[k]=in.nextInt();
				if(carsForRent[carNum[k]-1] instanceof PassagerCar){
					totalPeopleCapacity+=carsForRent[carNum[k]-1].peopleCapacity;
					PassengerCarName[x]=carsForRent[carNum[k]-1].name;
					x++;
				}
				else if(carsForRent[carNum[k]-1] instanceof Trunk){
			    	totalCargoCapacity+=carsForRent[carNum[k]-1].cargoCapacity;
			    	trunkName[y]=carsForRent[carNum[k]-1].name;
			    	y++;
				}
				else{
					totalPeopleCapacity+=carsForRent[carNum[k]-1].peopleCapacity;
					totalCargoCapacity+=carsForRent[carNum[k]-1].cargoCapacity;
					PassengerCarName[x]=carsForRent[carNum[k]-1].name;
					trunkName[y]=carsForRent[carNum[k]-1].name;
					x++;
					y++;
				}
				totalPrice+=carsForRent[carNum[k]-1].price;
			}
			System.out.println("请输入租车天数：");
			day=in.nextInt();
			totalPrice=totalPrice*day;
			System.out.println("--------------");
			System.out.println("您的账单");
			System.out.println("可载人的车有:");
			for(int m = 0;m<x;m++){
				System.out.print(PassengerCarName[m]+"  ");
				
			}
			System.out.println();
			System.out.println("可载货的车有:");
			for(int n = 0;n<y;n++){
				System.out.print(trunkName[n]+"  ");
				
			}
			System.out.println();
			System.out.println("--------------");
			System.out.println("合计：");
			System.out.println("总载人量:"+totalPeopleCapacity);
			System.out.println("总载货量:"+totalCargoCapacity);
			System.out.println("总价格:"+totalPrice);
			}
		
		
	}

}
