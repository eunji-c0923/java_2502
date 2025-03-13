package ex05;

public abstract class TV {
	

	//메소드 4개 만들기
//	1. 전원 on.off
//	2. 사운드 올리고 내리는 기능 담당하는 메소드

	
	boolean power;
	int volume;
	
	TV() {
		power = false;
		volume=0;
		
		this.power =  power;
		

	}//abstract 추상클래스 -> 추상클래스가 1개이상 존재하면 그 클래스는 추상클래스이다.
//	추상클래스를 가져가려면 추상메소드를 꼭 가져가야함
//	 근데 추상클래스안에 일반 메소드가 들어갈 수 있다. 하지만 일반클래스보다 메서드를 강제화 시킬때 쓰임
	
}
