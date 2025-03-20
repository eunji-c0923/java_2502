package ex04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date now = new Date();
		
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		now = new Date();//여기서 부터
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		//여기까지 한세트로 볼 수 있다 
	}

}
