package bankApp;

public class Bank 
{
	String bname;
	String loc;
	String ifsc_code;

	Account a;

	public Bank(String bname, String loc, String ifsc_code) {
		
		this.bname = bname;
		this.loc = loc;
		this.ifsc_code = ifsc_code;
	}

	public void bankDetails() {
		System.out.println(bname);
		System.out.println(loc);
		System.out.println(ifsc_code);
		if(a!=null) {
			System.out.println(a.Accont_hoder_name);
			System.out.println(a.dob);
			System.out.println(a.money);
			System.out.println(a.pin);
		}
		else {
			System.out.println("to check datails open account first");
		}
	}

	//public void createAccount(String account_holder_name, String dob, String pin, double money ) 
	//{
//		a=new Account(account_holder_name,dob,pin,money);
	//}

	public void createAccount(Account a) 
	{
		if (this .a == null) 
		{
		this.a=a;
		System.out.println("Account Succefully created");
		}
		else {
			System.out.println();
		}
	}

	public void deposit(long ano,double money) 
	{
		if(a.ano==ano) 
		{
		if(money!=0)
		{
		a.money=money+money;
		System.out.println("deposite amount is "+money);
		System.out.println("total balance is"+a.money);
		}
		else {
			System.out.println("enter some amount to add in account");
		}
	}
		else {
			System.out.println("enter valid account no.");
		}
	}

	public void withdrawl(long ano,double money) 
	{
		if(a.ano==ano) 
		{
		
		if(money>=money)
		{
		a.money=a.money-money;
		System.out.println("withdrawl amount is "+money);
		System.out.println("total balance is"+a.money);
		}
		else {
			System.out.println("insufficient balance");
		}
	}
		else {
			System.out.println("enter valid account no.");
		}
	}

	public void deleteAccount(long ano) 
	{
		this .a = null; 
		
		System.out.println("Account Succefully deleted");
		
	}
}
