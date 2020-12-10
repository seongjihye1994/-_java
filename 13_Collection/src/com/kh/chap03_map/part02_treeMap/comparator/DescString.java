package com.kh.chap03_map.part02_treeMap.comparator;

import java.util.Comparator;

public class DescString implements Comparator <String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1); // 내림차순 정렬
	}
	

}
