package ex02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



//단축키 컨트롤+2 -> L입력

public class Data {

	public static void main(String[] args) {

		String path = "c:/data/test2.db";

		OutputStream os = null;
		try {
              os = new FileOutputStream(path);
		        byte a = 10;
		        byte b = 20;
		        byte c = 30;
		os.write(arr);
		
		
		os.flush();
		
		os.close();
		}catch (FilNotFoundExcetion e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
