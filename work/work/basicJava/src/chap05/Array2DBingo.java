package chap05;

import java.util.Scanner;

public class Array2DBingo {

	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, bingoNum = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < SIZE * SIZE; i++)
		{
			bingo[i / 5][i % 5] = i + 1;
		}
		
		for(int i = 0; i < SIZE * SIZE; i++)
		{
			if(i % 5 == 0) 
			{
				System.out.println();
			}
			
			x = (int)(Math.random() * SIZE);
			y = (int)(Math.random() * SIZE);
			int temp = bingo[i / 5][i % 5];
			bingo[i / 5][i % 5] = bingo[x][y];
			bingo[x][y] = temp;
			
			System.out.print(bingo[i / 5][i % 5] + "\t");
		}
		System.out.println();
		
		do {
			for(int i = 0; i < SIZE * SIZE; i++)
			{
				if(i % 5 == 0) 
				{
					System.out.println();
				}
				System.out.print(bingo[i / 5][i % 5] + "\t");
			}
			System.out.println();
			
			System.out.print("���ڸ� �Է��ϼ���: ");
			int num = scanner.nextInt();
			
			for(int i = 0; i < SIZE * SIZE; i++)
			{
				if(bingo[i / 5][i % 5] == num)
				{
					bingo[i / 5][i % 5] = 0;
					break;
				}
			}
		} while(bingoNum < 5);

	}

}