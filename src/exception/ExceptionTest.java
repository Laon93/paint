package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 0;
			int result = 1000 / a;

			System.out.println(result);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
