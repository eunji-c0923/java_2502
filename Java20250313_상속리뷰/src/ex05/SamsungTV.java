package ex05;

public class SamsungTV extends TV {
	
	void powerOn() {
		this.power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	void powerOff() {
		this.power = false;
		System.out.println("전원이 꺼졌습니다.");
	}
	
	
}
