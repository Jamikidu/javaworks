package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		// 배열을 이용한 성적 처리(입력)
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;  // 상태 변수
		int[] scores = null;
		
		while(run) {
			try {
				System.out.println("----------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("----------------------------------------------");
				System.out.print("선택> ");
				
				int selectNo = Integer.parseInt(sc.nextLine());
				
				if(selectNo == 1) {
					System.out.print("학생수> ");
					int studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];  // 배열의 크기는 학생수임
				}else if(selectNo == 2 ) {
					if(scores == null) {  //학생수를 입력하지 않았다면
						System.out.println("1번 학생수를 먼저 입력해주세요");
					}else {
						System.out.println("점수를 입력하세요 ");
						for(int i=0; i<scores.length; i++) {
							System.out.print("scores[" + i + "]> ");
							scores[i] = Integer.parseInt(sc.nextLine());  // 점수 입력
						}
					}
				}else if(selectNo == 3 ) {
					if(scores != null) {  // 학생수가 빈리스트가 아니라면
						System.out.println("▽ 점수리스트를 출력합니다 ▽ ");
						for(int i=0; i<scores.length; i++) {
							System.out.println("    scores[" + i + "]> " + scores[i]);
						}
					}else {
						System.out.println("1번 학생수를 먼저 입력해주세요");
					}
					
				}else if(selectNo == 4) {
					//분석 총점, 평균, 최고점수
					if(scores != null) {
						
						int sumV = 0;
						double avg = 0;
						int maxV = scores[0];  // 최대값은 첫번째 값으로 설정
						
						
						for(int i=0; i<scores.length; i++) {
							sumV += scores[i];  // 누적합계
							
							if(maxV < scores[i]){maxV = scores[i];}
						}
						avg = (double)(sumV / scores.length);
						
						System.out.println("총점 : " + sumV);
						System.out.println("평균 : " + avg);
						System.out.println("최고 점수 : " + maxV);
					}else {
					System.out.println("1번 학생수를 먼저 입력해주세요");
					}
				}
				else if(selectNo == 5 ) {
					run = false;
					System.out.println("프로그램을 종료합니다.");
				}else {  // 숫자지만 1~5을 벗어났을때
					System.out.println("\t※ 지원되지 않는 기능입니다 ※");
				}
			}catch(Exception e) {
				System.out.println("\t※ 숫자 1~5를 입력해주세요 ※");
			}//try~catch 끝
		}//while 끝
	}//main 끝
}//class 끝
