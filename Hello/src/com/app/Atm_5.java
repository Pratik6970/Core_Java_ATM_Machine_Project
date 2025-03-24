package com.app;

import java.util.Scanner;

public class Atm_5 {
	
	public static double balance = 1000;
	
	public static void checkbalance()
	{
		System.out.println("CheckBalance here"+ balance);
	}
	
	public static void deposite()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Depsoite Amount here");
		
		double deposite = sc.nextDouble();
		
		if(deposite>0)
		{
			balance = balance+deposite;
			System.out.println("You can deposite amount successfully here"+deposite);
		}
		else
		{
			System.out.println("You can not deposite amount here");
		}
	}
	
	public static void withdraw()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter withdraw amount here");
		
		double withdraw = sc.nextDouble();
		
		if(withdraw>0 && withdraw<=balance)
		{
			balance = balance-withdraw;
			
			System.out.println("you can Withdraw balance here"+withdraw);
		}
		else if(withdraw>balance)
		{
			System.out.println("Insufficient funds here");
		}
		else
		{
			System.out.println("No withdraw amoun here sorry");
		}
	}
	
	public static void main(String[] args) {
		
		int pin = 1111;
		
		int eneterdpin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PIN Number Here");
		
		eneterdpin = sc.nextInt();
		
		if(pin == eneterdpin)
		{
			System.out.println("PIN is matching here");
			
			int choice;
			
			do {
				
				System.out.println("\nATM Menu:");
				System.out.println("1. CheckBalance");
				System.out.println("2. Deposite");
				System.out.println("3. WithDraw");
				System.out.println("4. Exit");
				
				choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					checkbalance();
				break;
				
				case 2:
					deposite();
					break;
					
				case 3:
					withdraw();
					break;
					
				case 4:
					System.out.println("Thanks for using ATM here");
					break;
					
				default:
					System.out.println("Invalid choice GoodBye here");
					break;
				}
				
			} while (choice!=4);
		}
		else
		{
			System.out.println("PIN is not matching here");
		}
		
	}

}
