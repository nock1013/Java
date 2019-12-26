package workbook;

public class CalcTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		if(args.length < 3 | args.length > 3)
		{
			System.out.println("�ٽ� �Է� �ϼ���");
		}
		else {
			switch (args[1]) {
			case "+":
				System.out.println("���: " + calculator.plus(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			case "-":
				System.out.println("���: " + calculator.minus(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			case "x":
				System.out.println("���: " + calculator.multiplication(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			case "/":
				System.out.println("���: " + calculator.divide(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			}
		}
		

	}

}
