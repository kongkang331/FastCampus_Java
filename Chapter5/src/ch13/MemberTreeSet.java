package ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
//		treeSet = new TreeSet<>();	// Comparable 로 했을 때 
		treeSet = new TreeSet<Member>(new Member());	// Comparator 사용 시 어떤 것을 사용할 건지 <>() 안에 지정해야 함 
		
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = treeSet.iterator();	// 형변환 안 하면 Object 로 에러남 
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			
			if (tempId == memberId) {
				treeSet.remove(member);	// index 지정, object 지정 중 여기서는 object 지정 사용 -> member
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		
		System.out.println();
	}
	
}
