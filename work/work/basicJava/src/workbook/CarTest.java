package workbook;

public class CarTest {
	public static void main(String[] args) {
		Car[] car = new Car[2];
		
		car[0] = new L3("L3","1500",50,25,0);
		car[1] = new L5("L5","2000",75,35,0);
		
		Car.println();

		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i].getName()+"\t\t"+car[i].getEngine()+"\t\t"+car[i].getOilTank()+"\t"+car[i].getOilSize()+"\t\t"+car[i].getDistance()
								  +"\t\t"+(((Temp)car[i]).getTempGage()));
		}
		System.out.println();
		System.out.println("25 ����");
		Car.println();
	
	for (int i = 0; i < car.length; i++) {
		car[i].setOil(25);
		System.out.println(car[i].getName()+"\t\t"+car[i].getEngine()+"\t\t"+car[i].getOilTank()+"\t"+car[i].getOilSize()+"\t\t"+car[i].getDistance()
				  +"\t\t"+(((Temp)car[i]).getTempGage()));
	}
	System.out.println();
	System.out.println("80 ����");
	Car.println();
	for (int i = 0; i < car.length; i++) {
		car[i].go(80);
		if(car[i] instanceof L3) {
			System.out.println(car[i].getName()+"\t\t"+car[i].getEngine()+"\t\t"+car[i].getOilTank()+"\t"+car[i].getOilSize()+"\t\t"+car[i].getDistance()
					  +"\t\t"+(((L3)car[i]).getTempGage()));
		}else {
			System.out.println(car[i].getName()+"\t\t"+car[i].getEngine()+"\t\t"+car[i].getOilTank()+"\t"+car[i].getOilSize()+"\t\t"+car[i].getDistance()
					  +"\t\t"+(((L5)car[i]).getTempGage()));
		}
	}
	}
}