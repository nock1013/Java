package chap05;

import java.util.Random;

public class ArrayExam04 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		Random rand = new Random();
		
		int sum = 0;
		float avg = 0.f;
		
		for(int i = 0; i < arr3.length; i++)
		{
			arr3[i] = rand.nextInt(10) + 1; 
			sum += arr3[i];
			System.out.print(arr3[i] + "\t");
		}
		System.out.println();
		
		avg = (float)sum / arr3.length;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);	
			
	}

}
