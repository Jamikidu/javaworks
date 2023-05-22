package twodimention;

public class TwoDimention2 {

	public static void main(String[] args) {
		// 5행 5열의 2차원 배열 생성 (*입력)
		char[][] a = new char[5][5];
		char[][] a2 = new char[5][5];
		char[][] a3 = new char[5][5];
		
		// 사각형 만들기
		for(int i=0; i<a.length; i++) {  //a.length = 5
			for(int j=0; j<a[i].length; j++) {  //a[i].length = 5
				a[i][j] = '*';	// 별 문자 저장
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==========");
		// 삼각형 모양 만들기
		for(int i=0; i<a2.length; i++) {
			for(int j=0; j<i+1; j++) {
				a[i][j] = '*';	// 별 문자 저장
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==========");
		// 역삼각형 모양 만들기
		for(int i=0; i<a3.length; i++) {
			for(int j=0; j<a3.length-i; j++) {
				a[i][j] = '*';	// 별 문자 저장
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==========");
		/* 이것도 가능
		for(int i=0; i<a3.length; i++) {
			for(int j=i; j<a3.length; j++) {
				a[i][j] = '*';	// 별 문자 저장
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
			i=0 j=0 a[0][0] *
			    j=1 a[0][1] *
			    j=2 a[0][2] *
			    j=3 a[0][3] *
			    j=4 a[0][4] *
			a3[0] *****
			i=1 j=1 a[1][1] *
				j=2	a[1][2] *
				j=3	a[1][3] *
				j=4	a[1][4] *
			a3[1] ****
			i=2 j=2 a[2][2] *
				j=3 a[2][3] *
				j=4 a[2][4] *
			a3[2] ***
			i=3 j=3 a[3][3] *
				j=4 a[3][4] *
			a3[3] **
			i=4 j=4 a[4][4] *
			a3[4] *
		} */
		/* 숫자로 사각형 만들기
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 */
		int[][] arr = new int[5][6];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//열의 종료값 x 행의 값 + (열의 값+1)  -- j=0 부터 이기때문에 +1 해줘야함
				arr[i][j] = (arr[i].length*i) + (j+1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
