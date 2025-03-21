package ex10;

import javax.swing.Box;

	class Box<T> {
		private T obj;
		
		public T getObj() {
			return obj;
			
		}
		
		public void setObj( T obj) {
			this.obj = obj;
		}
	}
		
class A{}   //계층도
class B extends A{}
class C extends B{}
class D extends C{}


	
	
	class Unboxer{
		public static <T> T openBox(Box<T> box) {
			return box.getObj();
								
		}
		
		public static void peekBox(Box<?> box) {
			System.out.println(box);
		}
		public class WildcardExam01 {

	public static void main(String[] args) {
	
		Box<String>box = new box<>();
	    Box.setObj("Hello Asterum");
	
	Unboxer.peekBox(box);
	Unboxer.openBox(box);
	}
	
	
	}
	
	

}
