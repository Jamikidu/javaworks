package methods;

public class Random1 {

	public static void main(String[] args) {
		// Math.random() 사용
		// 주사위 10번 던지기
		/* for(int i=1; i<=10; i++) {
			int dice = (int)(Math.random()*6 + 1);
			System.out.println(dice);
		} */
		
		// 문자를 난수(무작위)로 추출하기
		String[] word = {"나", "너", "우리", "세계"};
		int rnd = (int)(Math.random()*word.length);
		
		System.out.println(rnd);
		System.out.println(word[rnd]);
		
		// 로또 복권 추첨
		// 번호 6개 저장할 배열 선언
		// 추첨 번호(1 ~ 45)
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			// 중복 문제 발생
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {  // 이전 번호와 일치하면
					i = i - 1;  // 이전 인덱스로 이동 - 다시 추첨
				}
			}
		}
		
		//디버깅
		/*
		 * 29 24 31 (31) 25 15 16
		 * i=0 lotto[0]
		 * i=1 lotto[1]==lotto[0] fasle 29 24
		 * i=2 lotto[2]==lotto[1]
		 * 
		 */
		
		// 로또 번호 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}
	}

}
