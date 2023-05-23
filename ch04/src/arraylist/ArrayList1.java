package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// 기본 10개의 저장 공간이 생성
		ArrayList<String> cartList = new ArrayList<>();
		
		// 자료 저장 - add() 함수
		cartList.add("계란");
		cartList.add("콩나물");
		cartList.add("커피");
		
		//특정 1개 요소 가져오기(검색) - get() 함수
		System.out.println(cartList.get(0));
		System.out.println(cartList.get(1));
		
		
		//cartList 의 크기 - size() 함수
		System.out.println(cartList.size() + "개");
		
		//전체 요소 출력
		for(int i=0; i < cartList.size(); i++) {  //리스트를 순회하면서
			String cart = cartList.get(i);  //요소를 가져와서 cart 변수에 할당
			System.out.println(cart);  		//출력함
		}
		
		//요소 수정 - set()
		cartList.set(0, "라면");
		
		//요소 삭제 - remove()
		//cartList.remove(1);
		//contain() - 객체를 포함하다. 인덱스가 없으면 예외 발생되므로
		//contain() 를 사용 권장.
		if(cartList.contains("콩나물"))
			cartList.remove("콩나물");
		
		// 인덱스번호로 삭제할 경우
		// if(cartList.contains(cartList.get(2));
		//	 cartList.remove("2");  //인덱스를 써도 되고 자료넣어도 가능
		
		//향상 for문
		for(String cart : cartList)
			System.out.println(cart);
		
			
		
	}

}
