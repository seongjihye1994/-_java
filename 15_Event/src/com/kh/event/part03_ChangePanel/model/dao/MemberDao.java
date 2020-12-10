package com.kh.event.part03_ChangePanel.model.dao;

import java.util.ArrayList;

import com.kh.event.part03_ChangePanel.model.vo.Member;

public class MemberDao {
	public ArrayList<Member> openMemberListFile() {
		
		// 파일 입출력 코드 생략, 읽어왔다고 가정하고
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("성지혜", 20, "image/user.PNG"));
		list.add(new Member("홍길동", 21, "image/cat.PNG"));
		list.add(new Member("김개또", 22, "image/dog.PNG"));
		list.add(new Member("김말똥", 23, "image/tiger.PNG"));

		return list;
	}

}
