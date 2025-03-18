package ex013;

public class ArratCopyForExample {

	public static void main(String[] args) {

		/*int[] oldIntArray = new int[] {10,20,30,40,50};
		int[] oldIntArray2 = new int[5];
		oldIntArray2[0] = 10;
		*/
		
		int[] oldIntArray = {1,2,3};
		
		System.out.println(oldIntArray.length);
		
		int[] newIntArray = new int[6];
		
		//배열복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];  //배열복사
			
		}
			for(int i=0; i<newIntArray.length; i++)
				System.out.print(newIntArray[i] + " ");

	       System.out.println();
			
			int[] intArray = new int[10];
			
			System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length); //배열복사
			for(int i=0; i<intArray.length; i++)
				System.out.print(intArray[i] + " ");
	
                System.out.println();
	            System.out.println("======향상된For문=======");
//특별한 이유가 없으면 자주 쓰임
				for(int i : intArray)
					System.out.print(i + " ");
	
				/*
				 * System.arraycopy 이 식에는 
				 * for(int i=0; i<oldIntArray.length; i++) {
			          newIntArray[i] = oldIntArray[i]; 이게 다 포함되어 있다.
				 */
				
	}
	}


