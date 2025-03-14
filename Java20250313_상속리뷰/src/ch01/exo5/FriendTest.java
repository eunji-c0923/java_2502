package ch01.exo5;

public class FriendTest {

	public static void main(String[] args) {

		
		Student[] student = new Student[5];
		
		Friend[0] = new friend ("최준혁", 010-0312-0912,"folr04@naver.com");
		Friend[1] = new friend ("변현민", 010-9999-1101,"min1101@gmail.com");
		Friend[2] = new friend ("김병주", 010-0706-0312,"joooooo_0@naver.com");
		Friend[3] = new friend ("김병주", 010-0706-0312,"joooooo_0@naver.com");
		Friend[4] = new friend ("김병주", 010-0706-0312,"joooooo_0@naver.com");
		
		
		for(int i=0; i<student.length; i++) {
			String result=
					student[i].printInformation();
		}
		System.out.println(result);
	}

}
