package com.imooc;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int day;//�⳵����
		int []carNum=new int[7];//�⳵�����
		String []PassengerCarName=new String[7];
		String []trunkName=new String[7];
		int totalPeopleCapacity=0;//��������
		int totalCargoCapacity=0;//���ػ���
		int totalPrice=0;//�ܼ۸�
		cars[] carsForRent={new PassagerCar("�µ�A4",500,4),new PassagerCar("���Դ�6",400,4),new PickUp("Ƥ��ѩ6",450,4,2),new PassagerCar("����",800,20),new Trunk("�ɻ���",400,4),new Trunk("��ά��",1000,20)};
		System.out.println("��ӭʹ�������⳵ϵͳ");
		System.out.println("1�� 0��");
		Scanner in = new Scanner(System.in);   
		int intention=in.nextInt();
		if(intention==0){
			System.out.println("��л����ʹ��");
		}else{
			System.out.println("�����⳵�����ͼ����Ŀ��");
			System.out.println("���\t��������\t���\t����");
			for(int i=1;i<7;i++){
				System.out.print(" "+i+"\t");
				System.out.print(carsForRent[i-1].name+"\t");
				System.out.print(carsForRent[i-1].price+"Ԫ/��\t");
				if(carsForRent[i-1] instanceof PassagerCar){
					System.out.print(carsForRent[i-1].peopleCapacity+"��\t");
				}
				else if(carsForRent[i-1] instanceof Trunk){
					System.out.print(carsForRent[i-1].cargoCapacity+"��\t");	
				}
				else {
					System.out.print(carsForRent[i-1].cargoCapacity+"��     ");
					System.out.print(carsForRent[i-1].peopleCapacity+"��");
				}
				
				System.out.println();
				
			}
			System.out.println("��������Ҫ�⳵������");
			int num=in.nextInt();
			int x=0,y=0;
			for(int k=1;k<num+1;k++){
				System.out.println("�������"+k+"��������ţ�");
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
			System.out.println("�������⳵������");
			day=in.nextInt();
			totalPrice=totalPrice*day;
			System.out.println("--------------");
			System.out.println("�����˵�");
			System.out.println("�����˵ĳ���:");
			for(int m = 0;m<x;m++){
				System.out.print(PassengerCarName[m]+"  ");
				
			}
			System.out.println();
			System.out.println("���ػ��ĳ���:");
			for(int n = 0;n<y;n++){
				System.out.print(trunkName[n]+"  ");
				
			}
			System.out.println();
			System.out.println("--------------");
			System.out.println("�ϼƣ�");
			System.out.println("��������:"+totalPeopleCapacity);
			System.out.println("���ػ���:"+totalCargoCapacity);
			System.out.println("�ܼ۸�:"+totalPrice);
			}
		
		
	}

}
