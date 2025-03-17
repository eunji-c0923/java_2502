package ex01;

public class Mobile{

	 private String mobileName;
     private String osType;
     private int batterysize;
	
     public Mobile() {
    	 
     }
     
     public Mobile(String mobileName, String osType, int batterysize) {
    	 this.mobileName = mobileName;
    	 this.batterysize = batterysize;
    	 this.osType = osType;
    	 
    	    }
	/*
	 * 추상메소드-> Mobile을 상속하는 객체는 반드시 추상 메소드를 재정의 해서 사용
	 * 추상 클래스-> 객체 생성을 할 수 없다
	 */
	
     public abstract void operate(int time);
     public abstract void charge(int time);
 
     public String getMobilename() {
    	 return mobileName;
        
     }
     public void String setMobileName(String mobileName) {
    	 this.mobileName = mobileName;      
     }
     public int getBatterysize() {
    	 return batterysize;
        
     }
     public int setBatterysize(int batterysize) {
    	 this.batterysize = BatterySize;
        
     }
}
