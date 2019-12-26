package chap03;

public class Exercise05 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = 5f/9 * (fahrenheit - 32);
		celcius = celcius % 0.01f >= 0.005f ? 
				(celcius + 0.005f) / 0.01f * 0.01f : celcius / 0.01f * 0.01f;
		celcius -= celcius % 0.01f;

		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
	}

}
