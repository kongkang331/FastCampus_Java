package ch13;

import java.util.Comparator;

// Comparable or Comparator 가 구현되어 있어야 함 
// id 별로 오름차순으로 정렬 
//public class Member implements Comparable<Member> {
public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
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

	// 중복 방지 코드 = equals() + hashCode()
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			
			if (this.memberId == member.memberId) {
				return true;
			} else return false;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님 아이디는 " + memberId + "입니다.";
	}
	
//	@Override 
//	public int compareTo(Member member) {
		// return 값을 1과 -1 자리를 바꾸면 내림차순 정렬
//		if (this.memberId > member.memberId) return 1;
//		else if (this.memberId < member.memberId) return -1;
//		else return 0;
		// * (-1) == 내림차순 / 안 하면 기본 == 오름차순 
//		return (this.memberId - member.memberId * (-1));
//	}
	
	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	
}
