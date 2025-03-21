package ch06;

import java.util.HashSet;  //import 이제 부터 적용 시작! 개큰 빵빠레!
import java.util.Set;

class Member{		
	 String name;
	 int age;
	 
	 public Member(String name, int age) {
		 super();
		 this.name = name;
		 this.age = age;
		 
	 }
	
	 @Override
	 public String toString() {
		 return "Member[name= " + name + ", age= " + age + "]";
	 }
	 @Override
	 public int hashCode() {
		 System.out.println("===========hashCode");
		 return name.hashCode()+age;
	 }
	 @Override
	 public boolean equals(Object obj) {
		 System.out.println("===========equals");
		 Member m = (Member)obj;
		 return this.name.equals(m.name) && this.age == m.age;
	 
	 }
	 }

public class SetExam01 {
			
		public static void main(String[] args) {
				
				Set<Member> set = new HashSet();
						
				
			set.add(new Member("남예준", 24));
			set.add(new Member("남예준", 24));
			set.add(new Member("남예준", 24));

			
		for(Member m : set)
			System.out.println(m);
		
	}

}
