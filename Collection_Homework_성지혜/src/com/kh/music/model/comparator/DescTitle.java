package com.kh.music.model.comparator;

import java.util.Comparator;

import com.kh.music.model.vo.Music;

public class DescTitle implements Comparator <Music>{
//	곡명 별 내림차순 정렬 기준을 가
//	지고 있는 메소드

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
	



}
