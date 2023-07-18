package collections.member;

//VO - 자료형
public class Member {
	private int memberId;		//회원 아이디
	private String memberName;	//회원 이름
	
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	//getter, setter0
	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// 객체의 문자열 재정의
	@Override
	public String toString() {
		return memberId + ", " +memberName;
	}
	
	
}
