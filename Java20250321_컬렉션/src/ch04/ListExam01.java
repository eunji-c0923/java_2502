package ch04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExam01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
				
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		list.add(0,"Robot");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
	
		for(String str : list)  //향상된for
			System.out.println(str);
		System.out.println();
		System.out.println("===================");
		
		
		Iterator<String> itr = list.iterator();  //출력...의.....엥?   //itr=반복자 역활을 한다고 함
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		System.out.println();
		
		
		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		System.out.println();
		
		list.clear();   //전부삭제
//		System.out.println(list.get(0));
	}

}
