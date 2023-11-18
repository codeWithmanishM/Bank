
package bank_app;

import java.util.Scanner;

public class Bank_Driver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bname to open account");
		String bname = sc.next();
		
		System.out.println("Enter Bank address");
		String loc = sc.next();
		
		System.out.println("Enter IFSC_Code");
		String ifsc_code = sc.next();
		
		Bank b = new Bank(bname,loc,ifsc_code);
		
		boolean option= true;
		
		while(option) {
			System.out.println("enter your choice");
			System.out.println("enter 1, for create Account");
			System.out.println("enter 2, for check details");
			System.out.println("enter 3 for deposite money");
			System.out.println("enter 4 for withdraw");
			System.out.println("enter 5 for delete account");
			System.out.println("enter 6 for exit or close application");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("enter name");
				String name = sc.next();
				System.out.println("dob");
				String dob = sc.next();
				System.out.println("enter pin");
				String pin = sc.next();
				System.out.println("enter money to deposite");
				double money = sc.nextDouble();
				System.out.println("enter Account no. for your choice");
				long ano = sc.nextLong();
				b.createAccount(new Account(name, dob, pin,money, ano));
				System.out.println("========================================");
			}
			break;
			case 2:{
				b.bankDetails();
				System.out.println("========================================");
			}
			break;
			case 3:{
				System.out.println("enter account to depsite money");
				long ano1 =  sc.nextLong();
				System.out.println("enter how much money do you want to deposite");
				double money1 =  sc.nextDouble();
				b.WithDrawl(ano1, money1);
				System.out.println("========================================");
			}
			break;
			case 4:{
				System.out.println("enter account to withdraw money");
				long ano1 =  sc.nextLong();
				System.out.println("enter how much money do you want to withdraw");
				double money1 =  sc.nextDouble();
				b.WithDrawl(ano1, money1);
				System.out.println("========================================");
			}
			break;
			case 5:{
				b.DeleteAccount(choice);
			}
			break;
			case 6:{
				System.out.println("thank you for using:"+bname);
				System.out.println("have a good day");
				option = false;
			}
			break;
			default:{
				System.out.println("Enter your valid choice");
				break;
			}
			}
		}
//		System.out.println(b);
//		System.out.println(a.b);
		//b.bankDetails();
		
		
		
		
			//b.createAccount(new Account("Amit", "12/12/1997", "1234", 5500,35218553));
//		b.bankDetails();
		
//		b.deposit(12345, 1500);
//		b.bankDetails();
	//	
//		b.withdrawl(123456, 50);
//		b.bankDetails();
	//	
//		b.deleteAccount(0);
//		b.bankDetails();
	//	
//		b.Exit();
//		b.bankDetails();

	}
}
