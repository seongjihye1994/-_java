package com.kh.mini_Project.controller;

import java.util.ArrayList;

import com.kh.mini_Project.model.Facility;
import com.kh.mini_Project.model.Person;

public class MyPageController {
	
	Facility facility = new Facility();
	Person person = new Person();
	
	// ���ã�� ����Ʈ
	public static ArrayList<Facility> favoriteList = new ArrayList<Facility>();
	
	// �Ķ���ͷ� �Ѱܹ��� keep�� ����Ʈ�� �߰� // personŸ��? facility Ÿ��?
	public static ArrayList<Facility> addList(Facility keep) {
		favoriteList.add(keep);
		return favoriteList;
	}
	
	// ���ã�� ����
	public void removeList(Facility delete) {
		favoriteList.remove(delete);
	}
	
}
