package arrays;

public class Array1To10 {

	public static void main(String[] args) {
		// 1부터 10까지 출력 - 변수 사용
		// 합계
		int sum1 = 0;
		for (int i=1; i<=10; i++) {
			System.out.print(i + " ");
			sum1 += i;
		}
		
		System.out.println();
		System.out.println("sum1 = " + sum1);
		
		
		// 1부터 10까지 출력 - 배열 사용
		int[] arr1 = new int[10];
		int arr1Sum = 0;
		
		for (int i=0; i<arr1.length; i++) {
			arr1[i] = i+1;
			System.out.print(arr1[i] + " ");
			arr1Sum += arr1[i];
		}
		
		System.out.println();
		System.out.println("배열 합계 = " + arr1Sum);

	}

}
