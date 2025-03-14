package ch01.exo5;

public class person {

	private String name;
//디폴트생성자

	public person() {}
	
		
	
	
	public person(String name, String phonNum, String email) {
    	 this.name = name;
	}

	public String printInformation() {
		return name;
	}
	
	}