package ch01.ex6;

public class OverflowExample {

	public static void main(String[] args) {

		short num1 = 32767;  //최대값
		short num2 = -32768;  //최소값
	
		System.out.println(num1);
		System.out.println(num2);
		
		num1++;  //num = num +1
		
		System.out.println(num1);
		
		num2--;
        System.out.println(num2);		
		
          		
		
	}

}
