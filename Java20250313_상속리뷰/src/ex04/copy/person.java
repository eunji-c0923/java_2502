package ex04.copy;

public class person {
	private String name;
	private int age;

  person() {}  //생성자 꼭 체크!!
	
	person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		public String getName() {
			return name;
	}
     	public int getAge() {
	    	return age;
	}
	void sleep() {}
	void eat() {}
	
//	toString // 오버라이딩으로 변환하는법 배우기

	@Override
	public String toString() {
		return name + "," + age + "입니다.";
	}
	
	void introduce () {
		System.out.println("안녕하세요, 저는 " + name + "이고, 나이는" + age + "살입니다");
	}
}
