package exception;

import java.io.IOException;

public class MyClassTest {
	public static void main(String[] args) throws MyException {
		MyClass myClass = new MyClass();
		try {
			myClass.danger();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
