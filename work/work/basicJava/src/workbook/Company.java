package workbook;

public class Company {
	private double salary;					// �⺻��(��)
	private double annualIncome;			// ���ҵ�
	private double afterTaxAnnualIncome;	// ���� ���ҵ�
	private double bonus;					// ���ʽ�
	private double afterTaxBonus;			// ���� ���ʽ�
	
	public Company() {
		
	}
	public Company(double salary) {
		this.salary = salary;
		bonus = salary * 0.2;
	}
	
	public double getIncome() {
		annualIncome = salary * 12;
		return annualIncome;
	}
	public double getAfterTaxIncome() {
		afterTaxAnnualIncome = getIncome() - getIncome() * 0.1;
		return afterTaxAnnualIncome;
	}
	public double getBonus() {
		return bonus * 4;
	}
	public double getAfterTaxBonus() {
		afterTaxBonus = getBonus() - getBonus() * 0.055;
		return afterTaxBonus;
	}
}