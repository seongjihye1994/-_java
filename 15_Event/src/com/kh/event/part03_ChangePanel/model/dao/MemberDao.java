package com.kh.event.part03_ChangePanel.model.dao;

import java.util.ArrayList;

import com.kh.event.part03_ChangePanel.model.vo.Member;

public class MemberDao {
	public ArrayList<Member> openMemberListFile() {
		
		// ���� ����� �ڵ� ����, �о�Դٰ� �����ϰ�
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("������", 20, "image/user.PNG"));
		list.add(new Member("ȫ�浿", 21, "image/cat.PNG"));
		list.add(new Member("�谳��", 22, "image/dog.PNG"));
		list.add(new Member("�踻��", 23, "image/tiger.PNG"));

		return list;
	}

}
