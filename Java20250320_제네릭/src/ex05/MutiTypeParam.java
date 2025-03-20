package ex05;

class DBox<L,R> {
	private L left;
	private R right;
	
	public void set(L left,R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
		
	}
}


public class MutiTypeParam {

	public static void main(String[] args) {

		DBox<String, Integer> iBox = new DBox<String, Integer>();
		
		iBox.set("남예준", 24 );
		
		System.out.println(iBox);
		
	//	DBox<String, Integer> iBox = new DBox<String, Integer>();
		
		pBox
		pBox.set(new Person(), "아스테룸인");
		
		DBox<Person, String> pBox = new DBox<Person, String>();
		person p = new Person();
		pBox.set(P, "AAA");
		
		
		System.out.println();
		
		
		
		
		
         	
	}
	
	

}
