package arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		
		// 배열 복사(arr1 -> arr2)
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		//역순 복사(arr1 -> arr3) N E T -> T E N
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = arr1[(arr3.length-1)-i];  //내가 한 방식 : 복사할원본배열(현재배열의 크기 - 1) - i
			//또는 arr3[2-i] = arr1[i]
			System.out.print(arr3[i] + " ");
		}
		
		// 출력
//		System.out.println(arr1);
//		System.out.println(arr2);
		

	}

}
