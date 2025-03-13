package ex04.copy;

public class Student extends person {

	
	private String schoolName;
	private int grade;  //학년
	
    Student() {}  //생성자 꼭 체크!!!
		
	Student(String name, int age, String schoolName, int grade){
		super(name, age);
		this.schoolName =schoolName;
		this.grade = grade;
	}
	
	
    void study() {} //중괄호 안에 값을 입력해주면 Main에 값이 출력됨^^
    
	@Override
	public String toString() {
		return schoolName + "," + grade + "입니다.";
    
	}
    @Override
    void introduce () {
		System.out.println("안녕하세요, 저는 " + schoolName + "에 다니는" + grade + "학년으로 올라간" 
				+ getName() + "입니다.");

    }
}
