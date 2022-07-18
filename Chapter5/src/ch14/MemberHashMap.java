package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;	// key == Integer, Value == Member
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		
		System.out.println("No Element");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		
		// key 기반 호출 
		while(iterator.hasNext()) {
			int key = iterator.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
}
