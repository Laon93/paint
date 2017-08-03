package com.bigdata2017.paint.point;

import com.bigdata2017.paint.main.i.Drawable;

public class Point implements Drawable {
	private int x;
	private int y;

	public Point(int x, int y) {
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

	public void show() {
		System.out.println("점[x=" + x + ",y=" + y + "]을 그렸습니다.");
	}

	public void show(boolean visible) {
		if (visible) {
			show();
		} else {
			System.out.println("점[x=" + x + ",y=" + y + "]을 지웠습니다.");
		}
	}

	@Override
	public void draw() {
		show();
	}
	// shape 상속을 함으로써 구현할 수 없었던 함수를 구현해야했던 경우가 발생했는데
	// drawable 인터페이스를 받아옴으로써 구현할 수 없었던 함수를 구현할 필요가 사라짐
	/*
	 * @Override public int calcArea() { return 0; }
	 */
}
