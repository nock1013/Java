package workbook;

public class Calculator {
	public double plus(int a, int b) {
		return (double)a + b;
	}
	public double minus(int a, int b) {
		return (double)a - b;
	}
	public double multiplication(int a, int b) {
		return (double)a * b;
	}
	public double divide(int a, int b) {
		double result = 0.0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
		}
		return result;
	}
}
