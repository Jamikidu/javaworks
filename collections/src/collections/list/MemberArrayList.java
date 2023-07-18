package collections.list;

import java.util.ArrayList;

import collections.member.Member;

//Member 클래스를 관리하는 클래스(CRUD)
public class MemberArrayList {
	
	ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 생성 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 목록 보기
	public void showAllMember() {
		for(int i=0; i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 1명 보기
	public void showOneMember(int memberId) {
		for(int i=0; i<arrayList.size();i++) {
			int dbId = arrayList.get(i).getMemberId();
			if(dbId == memberId) {	//외부에 입력한 아이디와 같으면
				Member member = arrayList.get(i);
				System.out.println(member);
			}
		}
	}
	
	//회원 삭제 메서드
	public void removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId();
			if(dbId == memberId) {
				arrayList.remove(i);
				System.out.println(memberId + "번 삭.제.완.료");
				return;	//강제 종료
			}
			
		}
	}
}
