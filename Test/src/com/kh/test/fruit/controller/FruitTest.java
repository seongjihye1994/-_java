package com.kh.test.fruit.controller;

import java.util.ArrayList;

import com.kh.test.fruit.model.vo.Fruit;

public class FruitTest {
	
	public static void main(String[] args) {
		
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		
		list.add(new Fruit("���", "����"));
		list.add(new Fruit("������", "��ŭ"));
		list.add(new Fruit("Ű��", "��ŭ"));
		
		list.remove(0);
		System.out.println("�� ���� : " + list);
		
		
	}

}
