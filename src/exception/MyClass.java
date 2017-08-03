package exception;

import java.io.IOException;

public class MyClass {

	// throws Exception 해도 댐
	public void danger() throws IOException {
		int i = 1;
		System.out.println("some code ..." + i++);
		System.out.println("some code ..." + i++);
		if (1 == 1)
			throw new IOException();
		System.out.println("some code ..." + i++);
		System.out.println("some code ..." + i++);
	}
}
