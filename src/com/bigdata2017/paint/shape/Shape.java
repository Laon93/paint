package com.bigdata2017.paint.shape;

import com.bigdata2017.paint.main.i.Drawable;

public abstract class Shape implements Drawable{
	private String fillColor;
	private String lineColor;
	
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	//draw를 인터페이스로 빼면서 필요없어진 코드ㄹ
	//public abstract void draw(); 
	
	public abstract int calcArea();
}
