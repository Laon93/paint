package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("./hello.txt");

			int data = fis.read();

		}/*catch(FileNotFoundException | NullPointerException e ) {
			//이런식으로 한곳에서 처리해줘도 된다. 
			//or은 || 가 아니라 | 인것을 기억하기!
		}*//* catch (FileNotFoundException ex) {
			System.out.print("Error1 : ");
			ex.printStackTrace();
		} catch (IOException e) {
			System.out.print("Error2 : ");
			e.printStackTrace();
		}*/catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
