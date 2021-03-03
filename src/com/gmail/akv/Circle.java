package com.gmail.akv;

public class Circle extends Shape {
	private Point a;
	private Point b;

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Circle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	

	@Override
	public double getPerimetr() {
		double radius = Math
				.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		double radius = Math
				.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [aõ=" + a.getX() + ", ay=" + a.getY() + ", bx=" +b.getX() + ", by=" + b.getY() + ", getPerimetr " + getPerimetr() + ", getArea " + getArea() + "]";
	}
	

}
