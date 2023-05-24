package singleton.card;

public class CardTest {
	
	public static void main(String[] args) {
		// 카드회사 생성
				CardCompany cardcompany = CardCompany.getInstance();
				
				
				// 카드생성
				Card card1 = cardcompany.createCard();
				Card card2 = cardcompany.createCard();
				Card card3 = cardcompany.createCard();
				
				
				// 카드번호출력
				System.out.println("카드번호: " + card1.getcardNum());
				System.out.println("카드번호: " + card2.getcardNum());
				System.out.println("카드번호: " + card3.getcardNum());
				
	}
	
}
