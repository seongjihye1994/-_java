package com.kh.chap03_component.controller;

public class TestController {
	
	public int login(String id, String pwd) {
		if (id.equals("user1") && pwd.equals("user11")) {
			return 1;
		} else return 0;
	}

}
