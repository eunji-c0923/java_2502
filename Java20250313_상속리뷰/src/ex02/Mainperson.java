package ex02;

import ex04.copy.UniversityStudent;
import ex04.copy.person;

public class Mainperson {

	public static void main(String[] args) {


		UniversityStudent u1 = new UniversityStudent("장재영", 23, "한국대", 3, "시각디자인");
		u1.introduce();
		
		person p1 = new person("추상우",22);
		p1.introduce();
		
				
		Student s1 = new Student("한주연", 15, "한국중학교", 3);
		s1.introduce();
		
		System.out.println("================");
		
		System.out.println(p1);
		
	
		System.out.println(u1.toString());
		
		
		System.out.println(s1.toString());
	
		System.out.println("=====상위클래스는 하위클래스 참조가능=====");
		
		person p2 = new Student();
		
		Student s2 = new UniversityStudent();
	    
		System.out.println("======하위클래스는 상위클래스 참조 불가=====");
		
//		Student s3 = new person(); 
//		왜??? 참조가 안되???
//		활동범위가 제한이 되어 쓸 수 없다 근데 매번 안되는건 아니다
//						
		System.out.println("======하위클래스는 상위클래스 참조 가능한 경우=====");	
		
         person p4 = new Student();
         
         Student s4 = (Student)p4;  //이렇게 하면 가능
//       왜? 기능의 제한이 없다는 것 p4 가 접근할 수 있는 경우는 person에 제한되어 있는데 Student
//       메오리에는 접근이 가능해서 수식이 성립된다.
         
         p4 = new person();
//       s4 = (Student)p4;  //이건 불가능한 수식임 

		p4 = new UniversityStudent();
		s4 = (Student)p4;  //메모리 자체에 접근 제한 자체가 없다
		
		System.out.println("=======다형성=========");
//		다형성은 전제조건이 2가지가 있다
//		오버라이딩이 되어있어야 한다(자동변환+오버라이딩)
	    
		person p5 = new person();
		p5.sleep();
		p5.introduce();
		System.out.println(p5);
		
		p5= new Student();
		p5.sleep();
		p5.introduce();
		System.out.println(p5);
		
		
		p5 = new UniversityStudent();
		p5.eat();
		p5.introduce();
		System.out.println(p5);
		
	   
	   
	   
	   }
	
}
