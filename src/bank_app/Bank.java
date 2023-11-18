package bank_app;

public class Bank 
{
	String bname;
	String loc;
	String ifsc_code;
	 Account a ;
	public Bank(String bname, String loc, String ifsc_code) {
		super();
		this.bname = bname;
		this.loc = loc;
		this.ifsc_code = ifsc_code;
	}
	public void bankDetails() {
		System.out.println(bname);
		System.out.println(loc);
		System.out.println(ifsc_code);
		if(a!=null) {
			System.out.println(a.Bank_Account_Holder_name);
			System.out.println(a.dob);
			System.out.println(a.money);
			System.out.println(a.pin);
		}
		else {
			System.out.println("to check datails open account first");
		}
	}
	public void createAccount(Account a)
	{
		if (this.a==null) 
		{
			this.a=a;
			System.out.println("account created Succesfully");
		}else {
			System.out.println("Account number already existed");
		}
	}
	public void deposite(long ano, double money)
	{
		if(a.ano==ano)
		{
			if (money!=0) 
			{
				a.money=money+money;
				System.out.println("deposited money:"+money);
				System.out.println("Total Balance in Your account:"+a.money);
			} else 
			{
				System.out.println("Enter Some Amount");
			}
		}
		else {
			System.out.println("Enter valid Account number");
		}
	}
	public void WithDrawl(long ano, double money)
	{
		if(a.ano==ano)
		{
			if (money>=money) 
			{
				a.money=money-money;
				System.out.println("deposited money:"+money);
				System.out.println("Total Balance in Your account:"+a.money);
			} else 
			{
				System.out.println("Enter Some Amount");
			}
		}
		else {
			System.out.println("Enter valid Account number");
		}
	}
	public void DeleteAccount(long ano)
	{
		this.a=null;
		System.out.println("Account Deleted");
	}
}
