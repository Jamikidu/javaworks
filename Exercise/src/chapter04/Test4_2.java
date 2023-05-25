package chapter04;

public class Test4_2 {

	public static void main(String[] args) {
		// 확인2
		
		
		// 방법1
		int sumV=0;
		for(int i=1; i<(100/3)+1; i++) {
			sumV += 3*i;
		}
		System.out.println(sumV);
		
		
		// 방법2
		int[] arr = new int[100];
		int sumV2=0;
		for(int j=1; j<101; j++) {
			if(j%3==0) {
				arr[(j/3)-1] = j; 
			}
		}
		for(int i=0; i<100/3 ; i++) {
			sumV2 += arr[i];
		}
		// System.out.println(arr[0]);
		System.out.println(sumV2);
		System.out.println("==================");
		
		
		// 확인 3
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			System.out.println(dice1 + ", " + dice2);
			if(dice1 + dice2 == 5) break;
		}
		
		
		// 확인 4(숙제)
		
		
		
		// 확인 5(" "공백문제를 활용해서 풀것) + 방법2 j--로도 해볼것
	}

}
