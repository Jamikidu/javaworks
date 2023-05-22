package statics;

public class Card {
	static int serialNum = 100;
	int cardNum;		//카드번호
	
	Card(){
		serialNum++;
		cardNum = serialNum;
	}
	
	int getcardNum(){
		return cardNum;
	}
	
}
