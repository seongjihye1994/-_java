package com.kh.event.part03_ChangePanel.controller;

import java.util.ArrayList;

import com.kh.event.part03_ChangePanel.model.dao.MemberDao;
import com.kh.event.part03_ChangePanel.model.vo.Member;

public class MemberController {
	
	private MemberDao md = new MemberDao();
	
	// DAO로 멤버 리스트 데이터 호출
	public ArrayList<Member> getMemberList() {
		
		return md.openMemberListFile();
	}
			

}
