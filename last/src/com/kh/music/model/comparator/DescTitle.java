package com.kh.music.model.comparator;

import java.util.Comparator;

import com.kh.music.model.vo.Music;

public class DescTitle implements Comparator <Music>{
//	��� �� �������� ���� ������ ��
//	���� �ִ� �޼ҵ�

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
	



}
