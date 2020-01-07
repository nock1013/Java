package workbook;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[4];
		
		shape[0] = new Rectangle(4, 7, 5);
		shape[1] = new Rectangle(5, 4, 6);
		shape[2] = new Circle(6, 6, 7);
		shape[3] = new Circle(7, 8, 3);
		
		for(int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Rectangle) {
				System.out.println(((Rectangle)shape[i]).printInfo());
			}else {
				System.out.println(((Circle)shape[i]).printInfo());
			}	
			}
		System.out.println("After Move............................");
		/*Point p = new Point();
		p.setX(10);
		p.setY(10);*/
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Rectangle) {
				((Rectangle)shape[i]).move(10, 10);
				System.out.println(((Rectangle)shape[i]).printInfo());
			}else {
				((Circle)shape[i]).move(10, 10);
				System.out.println(((Circle)shape[i]).printInfo());
				
			}
			
			
		}
		 
		}
	}
