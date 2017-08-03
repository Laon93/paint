package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 0;
			int result = 1000 / a;

			System.out.println(result);
		}catch(Exception ex) {
			//1. 사용자에게 에러가 났음을 알리고 사과
			System.out.println("Sorry");
			//2. log 남기기
			ex.printStackTrace();
			
			//3.정상 종료
			return;
			
		}
		/*catch(ArithmeticException e) {
			//System.out.println("예외 발생");
			e.printStackTrace();
		}
		*/
		/*catch (Exception ex) {
			System.out.println(ex);
		}*/
		finally {
			System.out.println("자원정리");
		}
	}

}
