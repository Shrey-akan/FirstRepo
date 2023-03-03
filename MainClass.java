package com.atm;
import java.util.Scanner;


public class MainClass {


	public static void main(String[] args) {
		AtmOperationInterface sc = new AtmOperationImpl();
		int atmnumber = 12345;
		int pin = 111;
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome To Our ATM :");
		
		String username = "admin";
		String pass = "admin";
		String city = "Agra";
		
		
		System.out.println("Enetr ID :");
		String s1 = scn.nextLine();
		System.out.println("Enetr PASSWORD :");
		String s2 = scn.nextLine();
		System.out.println("Enetr CITY :");
		String s3 = scn.nextLine();
		if((s1.equals(username)) && (s2.equals(pass)) &&(s3.equalsIgnoreCase(city))) {
			
		
		System.out.println("Enetr ATM Number :");
		
		int atmNumber = scn.nextInt();
		
		System.out.println("Enetr PIN  :");
		
		int atmPin = scn.nextInt();
		
		if((atmnumber==atmNumber)&&(pin==atmPin)) {
			while(true) {
				System.out.println("1.View Available balance\n2.Withdraw Amount\n3.Deposite Amount\n"
						+ "4.View Mini Statement\n5.Exit");
				System.out.println("Enetr Choice :");
				int ch = scn.nextInt();
				if(ch==1) {
					sc.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter Withdrawl Amount :");
					double withdraw = scn.nextDouble();
					if(withdraw%500==0) {
						sc.withdrawAmount(withdraw);
					}
					else {
						System.out.println("Please Enter Multiple Of 500 :");
					}
				}
				else if(ch==3) {
					
					System.out.println("Enter Amount To Deposite :");
					
					double deposite = scn.nextDouble();
					
					sc.depositAmount(deposite);
				}
				else if(ch==4) {
					sc.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("Please Collect Your ATM Card \n Thank You For Using ATM ");
					
				
				}
				else {
					System.out.println("Please Enter Correct Choice");
				}
				
			}
		}
		else {
			System.out.println("Validation Not Done");
			
		}

		}
		else {
			System.out.println("Enter Correct UserID And Password");
		}
	}

}