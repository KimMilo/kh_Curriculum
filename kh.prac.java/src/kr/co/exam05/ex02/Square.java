package kr.co.exam05.ex02;

public class Square {
	
	private double width;
	private double height;
	private double round;
	private double area;
	
	public Square(double width) {
		this.width = width;
		this.height = width;
		this.round = width * 4;
		this.area = width * width;
	}
	public Square(double width, double height) {
		this.width = width;
		this.height = height;
		this.round = (width + height) *2;
		this.area = width * height;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
		
	}
	public double getRound() {
		return this.round;
	}
	public double getArea() {
		return this.area;
	}
}
