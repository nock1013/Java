public class ScoreExam
{
	public static void main(String[] args)
		{
			int kor, math, eng, total, avg;
			kor = 80;
			math = 10;
			eng = 77;

			total = kor + math + eng;
			avg = total / 3;

			System.out.println("[���]");
			System.out.println("���� => " + total);
			System.out.println("��� => " + avg);
		}

}