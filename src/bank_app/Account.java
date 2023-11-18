package bank_app;

public class Account 
{
	String Bank_Account_Holder_name;
	String dob;
	String pin;
	double money;
	long ano;
	public Account(String bank_Account_Holder_name, String dob, String pin, double money, long ano) {
		super();
		this.Bank_Account_Holder_name = bank_Account_Holder_name;
		this.dob = dob;
		this.pin = pin;
		this.money = money;
		this.ano = ano;
	}
	public void AccountDetails()
	{
		System.out.println(Bank_Account_Holder_name);
		System.out.println(dob);
		System.out.println(pin);
		System.out.println(money);
		System.out.println(ano);
	}
}
