package kr.co.exam13.ex02.shape.controller;
 
import kr.co.exam13.ex02.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(s.getType(), height, width);
		double perimeter = 2 * (width + height);
		return perimeter;
		
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(s.getType(), height, width);
		double area = width * height;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String result = "사각형" + s.information();
		return result;
	}
	
}
