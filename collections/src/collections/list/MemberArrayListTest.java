package collections.list;

import collections.member.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberList = new MemberArrayList();
		
		//Member 객체 생성
		Member m1 = new Member(101, "이순신");
		Member m2 = new Member(102, "안산");
		Member m3 = new Member(103, "추신수");
		
		//회원을 추가
		memberList.addMember(m1);
		memberList.addMember(m2);
		memberList.addMember(m3);
		
		System.out.println(m1);
		
		//회원 전체 목록 조회
		memberList.showAllMember();
		System.out.println("=====구=====분=====선=====");
		
		//회원 1명 조회
		memberList.showOneMember(101);
		
		//회원 삭제 (102)
		memberList.removeMember(103);
		//삭제 확인
		memberList.showAllMember();
		
	}

}
