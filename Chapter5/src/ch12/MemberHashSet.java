package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
		
	}
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = hashSet.iterator();	// 형변환 안 하면 Object 로 에러남 
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			
			if (tempId == memberId) {
				hashSet.remove(member);	// index 지정, object 지정 중 여기서는 object 지정 사용 -> member
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		
		System.out.println();
	}
	
}
