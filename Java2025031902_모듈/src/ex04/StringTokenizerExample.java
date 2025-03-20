package ex04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String data1 = "남예준&한노아,채밤비-도은호,";
		
		String[] arr = data1.split("&|,|-");
		
		System.out.println(Arrays.toString(arr));
		
		for(String token : arr)
			System.out.println(token);
		

		String data2 = "유하민/도은호,채밤비-한노아";
		
		StringTokenizer st = new StringTokenizer(data2, "/,-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	     
	}

}
