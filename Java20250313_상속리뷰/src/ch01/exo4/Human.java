package ch01.exo4;

public class Human {

	private String name;
	private int age;
	private int height;
	private int weight;
	
//디폴트생성자

	public Human() {}
	
		
	
	
	public Human(String name, int age,int height, int weight) {
    	 this.name = name;
    	 this.age = age;
    	 this.height = height;
    	 this.weight = weight;
    	 
	}

	public String printInformation() {
		return name + " " + age + " " + height + " "+ weight;
	}
	
	}