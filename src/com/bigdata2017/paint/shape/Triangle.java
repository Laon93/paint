package com.bigdata2017.paint.shape;

public class Triangle extends Shape {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	
	@Override
	public void draw() {
		System.out.println( "삼각형을 그렸습니다." );
	}

	@Override
	public int calcArea() {
		return (x2-x1) * (y2-y3) / 2;
	}

	/*@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		
	}*/
	
	
}
