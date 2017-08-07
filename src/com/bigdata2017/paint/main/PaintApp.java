package com.bigdata2017.paint.main;

import com.bigdata2017.paint.main.i.Drawable;
import com.bigdata2017.paint.main.i.Resizeable;
import com.bigdata2017.paint.point.ColorPoint;
import com.bigdata2017.paint.point.Point;
import com.bigdata2017.paint.shape.Circle;
import com.bigdata2017.paint.shape.Rectangle;
import com.bigdata2017.paint.shape.Triangle;

public class PaintApp implements Resizeable {

	public static void main(String[] args) {
		Point point1 = new Point(100, 50);
		point1.show();
		point1.show(false);

		draw(new Point(200, 200));
		draw(new ColorPoint(300, 100, "red"));
		draw(new ColorPoint(200, 200, "yellow"));

		// Shape
		draw(new Triangle());
		draw(new Rectangle());
		
		Point[] points = new Point[10];
		
		//anonymous class object
		//딱 한번만 그 인터페이스에 구현되어있는 것을 사용하고 버리겠다 
		//할때 사용 하는 것이 anonymous class object
		//이름이 없는 익명 class
		draw(new Drawable() {
			@Override
			public void draw() {
				//결국 이름 없는 임시로 만든 class가 되는 것
				System.out.println(points);
				System.out.println("anonymous class 생성 완료");
			}
		});
		
		
		// circle은 기본 생성자가 없으니까 생성자를 정의해둔 대로 생성을 해야함.
		draw(new Circle(10, 20, 5));

		// resize test
		// resize(new Triangle());
	}

	/*
	 * private static void draw( Point point ) { point.show(); }
	 * 
	 * private static void draw( Shape shape ) { shape.draw(); }
	 */
	private static void draw(Drawable drawable) {
		drawable.draw();
	}

	@Override
	public void resize(double rate) {

		resize(0.5);

	}

}
