package randoms;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 영어 타자 게임 만들기
		String[] words = {"river", "mountain", "sky", "earth", "moon",
				"tree", "flower", "cow", "pig", "horse"};
		int qNum = 1;
		double start, end;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("영어타자 게임, 준비되면 엔터 ");
		sc.nextLine();
		start = System.currentTimeMillis();	//게임시작 시간측정
		while (qNum < 11) {
			int word = (int)(Math.random()*words.length);
			String question = words[word];
			System.out.println("문제"+qNum+"/ "+question);
			String answer = sc.nextLine();
			if(answer.equals(question)) {
				System.out.println("통과!");
				qNum++;	//통과하면 문제번호 1 증가
			}else {
				System.out.println("오타! 다시");
			}
			
		}
		end = System.currentTimeMillis();	//게임종료 시간측정
		System.out.printf("게임 소요 시간은 %.2f 초입니다.",(end - start)/1000);
		sc.close();
	}

}
