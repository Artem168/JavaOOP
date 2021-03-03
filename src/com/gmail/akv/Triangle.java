package com.gmail.akv;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	

	@Override
	public double getPerimetr() {
		double sideOne = Math
				.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
		double sideTwo = Math
				.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
		double sideThree = Math
				.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) + (c.getY() - a.getY()) * (c.getY() - a.getY()));
		double p = (sideOne + sideTwo + sideThree) / 2;
		return sideOne + sideTwo + sideThree;
	}

	@Override
	public double getArea() {
		double sideOne = Math
				.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
		double sideTwo = Math
				.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
		double sideThree = Math
				.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) + (c.getY() - a.getY()) * (c.getY() - a.getY()));
		double p = (sideOne + sideTwo + sideThree) / 2;
		return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
	}

	@Override
	public String toString() {
		return "Triangle [aõ=" + a.getX() + ", ay=" + a.getY() + ", bx=" +b.getX() + ", by=" + b.getY() + ", cx=" + c.getX() + ", cy=" + c.getY() +  ", getPerimetr " + getPerimetr() + ", getArea " + getArea() +"]";
	}

}
