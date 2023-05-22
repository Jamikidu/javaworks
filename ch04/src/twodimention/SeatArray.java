package twodimention;

import java.util.Scanner;

public class SeatArray {

	public static void main(String[] args) {
		// 입장객 수에 따라 좌석을 배치하는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		int customer;   //입장객 수 저장
		int colNum = 0;	    //좌석 열 수 저장
		int rowNum = 0;	    //줄(행)의 수 저장
		
		
		
		System.out.print("입장객 수를 입력하세요: ");
		customer = sc.nextInt();
		
		System.out.print("좌석 열의 수를 입력하세요: ");
		colNum = sc.nextInt();
		
		//연산 처리(조건문) - 나누어 떨어지는 경우, 줄수에 1을 더하는 경우
		if(customer % colNum == 0) {
			rowNum = customer / colNum;  //나누는 몫
		}else {
			// rowNum = (int)(customer / colNum) + 1;  //몫 + 1
			rowNum = customer / colNum + 1;  //몫 + 1
		}
		
		//자리배치할 배열 공간 생성
		int[][] arr = new int[rowNum][colNum];
		
		
		for(int i=0; i<rowNum; i++) {
			for(int j=0; j<colNum; j++) {
				//열의 종료값 x 행의 값 + (열의 값+1)  -- j=0 부터 이기때문에 +1 해줘야함
				arr[i][j] = (colNum*i) + (j+1);
				if(customer < arr[i][j])
					break;
				System.out.print("좌석" + arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
