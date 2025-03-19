package ex01;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

 class Person {
	 private String name;
	 private int age;
	 
	 public Person( String name, int age) {
		 this.name = name;
		 this.age = age;
		 
	 }
	 
	/* @Override
	 public int hashCode() {
		 
		 return super.hashCode(); 
	 }
*/
	 
	 @Override
	public boolean equals(Object obj) {
		 System.out.println("=======equals=========");
		
		 Person o = (Person)obj;
		 
		 return super.equals(obj);

	 }
 }

public class PersonTest {

	public static void main(String[] args) {
		
		
		String str1 = new String("유하민");
		String str2 = new String("유하민");
		
		System.out.println(str1.equals(str2));
		
		Person p1 = new Person("유하민",5);
		Person p2 = new Person("유하민",1);
		
		System.out.println(p1.equals(p2));
		
		Person p3 = new Person("유하민",20);
		Person p4 = new Person("유하민",20);
		
		System.out.println(p3.equals(p4));
	}

}
