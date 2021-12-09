package oop;

public class Point {

	private int x;
	private int y;
	
	public Point() {

	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
	
		return Math.sqrt((getX()*getX()) + (getY()*getY()));
	}

	public double distance( int x, int y) {
		
		 return Math.sqrt((x-getX())*(x-getX()) + (y-getY())*(y-getY()));	
	}
	
	public double distance(Point point) {
		
        return distance(point.x, point.y);

	}
	
	
	public static void main(String[] args) {
		Point first = new Point(6, 5);
		Point second = new Point(3, 1);
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2,2)= " + first.distance(2, 2));
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
	}
}

/*How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:*/

/*d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)*/
/*
* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
*/