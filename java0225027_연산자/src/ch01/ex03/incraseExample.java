package ch01.ex03;

public class incraseExample {

	public static void main(String[] args) {
        //증감연산자 -> 전위 , 후위

		int a = 1;
		int b = 0;
		
		
		b = ++a; //값 하나 증가하고 대입
        System.out.println("a="+ a + ", b="+b);
        System.out.printf("a=%d, b=%d\n",a,b);
        
        int c = 1;
        int d = 0;
        
        d = c++;  //c의 값을 먼저 계산 후 증가시킴
        System.out.printf("c=%d, d=%d\n",c,d);
	
	}

}
