package chap04;

public class GuGu {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
		
		/*for(int i = 1; i <= 9; i++)
		{
			for(int j = 2; j <= 9; j++)
			{
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}*/

	}

}
