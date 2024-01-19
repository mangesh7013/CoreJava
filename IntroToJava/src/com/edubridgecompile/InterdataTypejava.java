package com.edubridgecompile;

import java.util.Scanner;

public class InterdataTypejava {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner (System.in);
	byte num=s.nextByte();
	short x=s.nextShort();
	int y=s.hashCode();
	long z=s.nextLong();
	System.out.println("The byte num value is :"+num);
	System.out.println("The short x value is :"+x);
	System.out.println("The short y value is :"+y);
	System.out.println("The short z value is :"+z);
	s.close();
	}
}

