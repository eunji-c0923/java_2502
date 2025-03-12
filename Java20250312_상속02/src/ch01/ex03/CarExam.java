package ch01.ex03;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.tire = new tire();
		myCar.run();
		
        myCar.tire = new HankookTire();
		myCar.run();
		
        myCar.tire = new KumhoTire();
		myCar.run();
		
	
	}

}
