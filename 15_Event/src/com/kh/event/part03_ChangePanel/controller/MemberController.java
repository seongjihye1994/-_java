package com.kh.event.part03_ChangePanel.controller;

import java.util.ArrayList;

import com.kh.event.part03_ChangePanel.model.dao.MemberDao;
import com.kh.event.part03_ChangePanel.model.vo.Member;

public class MemberController {
	
	private MemberDao md = new MemberDao();
	
	// DAO�� ��� ����Ʈ ������ ȣ��
	public ArrayList<Member> getMemberList() {
		
		return md.openMemberListFile();
	}
			

}
