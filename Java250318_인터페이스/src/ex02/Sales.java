package ex02;

public class Sales extends Employee imlements Bonus {

	public Sales() {
		
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name,number, department, salary);
		
		}
	@Override
	public double tax( ) {
		return getSalary()*0.1;
			
	}
	
	@Override
	public void incentive(int pay) {
		

		int ssalary = getSalare();
		salary += pay*0.8
	
}
