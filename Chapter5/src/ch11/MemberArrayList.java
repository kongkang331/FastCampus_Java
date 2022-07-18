package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = arrayList.iterator();	// 형변환 안 하면 Object 로 에러남 
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			
			if (tempId == memberId) {
				arrayList.remove(member);	// index 지정, object 지정 중 여기서는 object 지정 사용 -> member
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		
		System.out.println();
	}
	
}
