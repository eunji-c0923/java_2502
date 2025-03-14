package ch01.exo4;

public class StudentTest {

	public static void main(String[] args) {

		
		Student[] student = new Student[3];
		
		student[0] = new Student ("최준혁", 31, 183, 73,"201303", "실음");
		student[1] = new Student ("변현민", 28, 178, 65,"201312", "체육과");
		student[2] = new Student ("김병주", 29, 175, 60,"201352", "유아교육학과");
	
		for(int i=0; i<student.length; i++) {
			String result=
					student[i].printInformation();
		}
		System.out.println(result);
	}

}
