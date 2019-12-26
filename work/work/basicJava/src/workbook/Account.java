package workbook;

public class Account {
	private String account;
	private int balance;			//å���� int���� ���� ���� ��� ������ long���� �����Ѵ�
	private double interestRate;
	
	public Account() {
		
	}
	public Account(String account, int balance, double interestRate)
	{
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalace() {
		return balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance * (interestRate / 100);
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) 
	{
		balance -= money;
	}
	public void print()
	{
		System.out.println("��������: " + account + " �����ܾ�: " + balance);
	}
	
 }
	
