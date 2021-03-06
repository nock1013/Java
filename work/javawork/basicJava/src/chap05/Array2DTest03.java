package chap05;
// 2차원 배열의 선언과 생성과 초기화하기
public class Array2DTest03 {

	public static void main(String[] args) {
		int[][] myArr = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
		}; // int[][] myArr = new int[3][5];
		
		int[][] myArr2 = {
				{1, 2, 3},
				{6, 7, 8, 9},
				{11, 12, 13, 14, 15}
		}; // int[][] myArr2 = new int[3][];
		
		// myArr와 myArr2의 배열의 배열에 저장된 값을 출력하기
		
		for(int i = 0; i < myArr.length; i++)
		{
			for(int j = 0; j < myArr[i].length; j++)
			{
				System.out.print(myArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i = 0; i < myArr2.length; i++)
		{
			for(int j = 0; j < myArr2[i].length; j++)
			{
				System.out.print(myArr2[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
