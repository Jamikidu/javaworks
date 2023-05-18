package arrays;

public class Array1 {

	public static void main(String[] args) {
		// 정수 10개를 저장할 배열 선언
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println("배열의 길이(크기) " + arr.length);
		System.out.println(arr[0]);
		
		//값 수정(변경)
		arr[2] = 7;
		
		//배열의 요소 전체 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		
		//5개의 크기를 가진 정수형 배열 선언
		int[] arr2 = {2, 4, 6, 8, 10};
		
		System.out.println(arr2[1]);
		
		//4번 인덱스의 값을 100으로 변경
		arr2[4] = 100;
		
		//전체출력
		for(int j=0; j<arr2.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		

	}

}
