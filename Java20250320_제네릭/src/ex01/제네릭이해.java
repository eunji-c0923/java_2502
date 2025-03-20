package ex01;

import lombok.Getter;
import lombok.Setter;

class Apple{
@Override
public String toString() {
	return "I am an apple.";
}
}

class appleBox{
	private Apple ap;
	
}
public Apple getAp() {
	return ap;
}

public Apple SetAp(Apple ap) {
	this.ap = ap;
}

class Orange{
	@Override
	public String toString() {
		return "I am an orange.";
		
}
}

class orangeBox{
	private Orange op;
	
}
public Orange getOp() {
	return op; 
			}

public void SetOp(Orange op) {
	this.op; = op;
}
	
	
}

public class 제네릭이해 {

	public static void main(String[] args) {
	
		appleBox aBox = new appleBox();  //사과클래스만 담는다
		orangeBox oBox = new orangeBox();  //오렌지클래스만 담는다
		
		aBox.setAp(new Apple()); //사과박스에 사과를 담는다.
		oBox.setOp(new Orange()); //오렌지 박스에 오렌지를 담는다.
	
         	
	}
	
	

}
