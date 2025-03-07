package ch01.ex0;


//클래스명-> 첫글자는 대문자로
public class person {


//	필드, 인스턴스 변수
			private String name;
			private String phone;
			private int age;
			

			/*
			 * 생성자는 값 초기화의 목적이 있다
			 * 생성자 : 값초기화
			 */
	
		public person(String n, int a , String p) {
				name = n;
				age = a;
				phone = p;
				
			}
		
		//디폴트생성자	
		public person() {
			System.out.println("void Person()");
						// TODO Auto-generated method stub	
		}	
//		메소드,인스턴스 메소드
			void 나이출력() {
				System.out.println("나이: "+ age);
			}
				void 전화번호출력() {
					System.out.println("전화번호: " + phone);
				}		
					void 이름출력() {
						System.out.println("이름은: "+name);
												
					}
					
						
					}
				
			
	
//클래스 생성 정적인것들(변하지 않는것)
