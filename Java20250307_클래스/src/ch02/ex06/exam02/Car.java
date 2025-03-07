package ch02.ex06.exam02;

public class Car {

	
	private	String company ="현대자동차";
	private	String model;
	private	String color;
	private	int maxSpeed;
		
	String getCompany() {
		return company;
		
	}
	
	Car() { //생성자는 무조건 대문자로!!!!
		
	}
	
	Car(String madel) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

