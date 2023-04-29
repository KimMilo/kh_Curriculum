package kr.co.exam13.ex02.shape.controller;

import kr.co.exam13.ex02.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s = new Shape(s.getType(), height, width);
		double area = (width * height) / 2;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String result = "삼각형" + s.information();
		return result;
	}
}
