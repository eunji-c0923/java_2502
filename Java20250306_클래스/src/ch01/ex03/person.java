package ch01.ex03;


//클래스명-> 첫글자는 대문자로
public class person {


//	필드, 인스턴스 변수
			String name;
			String phone;
			int ang;
			int kor; 
			int eng; 
			int math;
			
//		메소드,인스턴스 메소드
			void 공부하기(int age) {
				System.out.println("나이: "+ age);
			}
				void 전화번호출력(String phone) {
					int sum = kor +eng + math;
					System.out.println("전화번호: " + phone);
				}		
					void 이름출력(String name) {
						System.out.println("이름은: "+name);
						
						
					}
					public void 나이출력(int ang2) {
						// TODO Auto-generated method stub
						
					}
				}
			
	
//클래스 생성 정적인것들(변하지 않는것)
