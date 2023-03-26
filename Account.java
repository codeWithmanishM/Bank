package bankApp;

public class Account 
{
	String Accont_hoder_name;
	String dob;
	String pin;
	double money;
	long ano;
	public Account(String accont_hoder_name, String dob, String pin, double money, long ano) {
		
		Accont_hoder_name = accont_hoder_name;
		
		this.dob = dob;
		this.pin = pin;
		this.money = money;
		this.ano=ano;
	}
	public void accountDetails() {
		System.out.println(Accont_hoder_name);
		System.out.println(ano);
		System.out.println(dob);
		System.out.println(pin);
		System.out.println(money);
	}
}
