package workbook;

public class Circle extends Shape implements Movalble {
	private int redius;
	
	public Circle() {
		
	}

	public Circle(int redius, int x, int y) {
		super(new Point(x,y));
		this.redius = redius;
	}

	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+1+x);
		point.setY(point.getY()+1+y);
		
	}

	@Override
	public double getArea() {
		
		return getRedius()*getRedius()*Math.PI;
	}

	@Override
	public double getCircumference() {
		
		return 2*getRedius()*Math.PI;
	}
	
	public String printInfo() {
		
		return "Circle :  "+getRedius()+"   " + point.getX()+"   "+point.getY();
	}

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}
	
	

}
