package ex04.copy;


public class Mainperson {

	public static void main(String[] args) {

//		 person p2 = new UniversityStudent();
//		 UniversityStudent u2 = (UniversityStudent)p2;
//		 u2.registerCourse();
		
		person p1 = new person();
		Student s1 = new Student();
	    UniversityStudent u1 = new UniversityStudent();
	
	     
	    method(u1);
	    method(s1);   
	    method(p1);
	
	
	}//p가 참조하고 있는 대상은 Person 객체이거나 Person을 상속한 객체
	   static void method(person p) {
		  
	 //↓ p를 참조하고 있는(instanceof) 객체가 누구인지(UniversityStudent) 물어보고 있는것   
		 if(p instanceof UniversityStudent) { 
		   UniversityStudent u = (UniversityStudent)p;

		   u.sleep();
		   u.study();
		   u.registerCourse();
		 //↓ p를 참조하고 있는(instanceof) 객체가 누구인지(tudent) 물어보고 있는것	  
  }else if(p instanceof Student) {
  	 Student s = (Student)p;//객체타입확인 (instanceof)를 사용
  	 s.sleep();
  	 s.study();
  }else {
  	p.sleep();
  	
  }
		System.out.println("------------빠뿅");   
		   
		   
//		  p.sleep();   이렇게 적어도 상관없음 
//		  p.student 는 작성이 안됨
//		  그래서 UniversityStudent s = (UniversityStudent)p;
//		  그럼 s.sleep(); / s. student(); / s.registerCourse(); 가능한데
//		  s.registerCourse(); 이거 때문에 오류가 생길 수 있다 그 이유는 S안에는 P가 들어있는데
//		  S를 감싸주는 U가 없기 때문이다.

	
	
	}

}
