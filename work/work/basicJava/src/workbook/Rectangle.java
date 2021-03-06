package workbook;

public class Rectangle extends Shape implements Movalble {
	private int width;
	
	public Rectangle() {
		
	}

	public Rectangle(int width, int x, int y) {
		super(new Point(x,y));
		this.width = width;
	}

	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+x+2);
		point.setY(point.getY()+y+2);
	}

	@Override
	public double getArea() {
		 
		return getWidth()*getWidth();
	}

	@Override
	public double getCircumference() {
		
		return getWidth()*4;
	}
	
	public String printInfo() {
		return "Rectangle : "+getWidth()+" \t"+point.getX()+"   "+point.getY();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
