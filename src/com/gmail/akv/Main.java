package com.gmail.akv;

public class Main {

	public static void main(String[] args) {

		Point a = new Point(0, 0);
		Point b = new Point(2, 0);
		Point c = new Point(-8, 4);
		Triangle triangleOne = new Triangle(a, b, c);
		Circle circleOne = new Circle(a, b);
		Shape spOne = triangleOne;

		System.out.println(spOne.toString());

		Shape spTwo = circleOne;
		System.out.println(spTwo.toString());

	}

}
