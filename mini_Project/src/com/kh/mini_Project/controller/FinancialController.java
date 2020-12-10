package com.kh.mini_Project.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.mini_Project.model.ATM;
import com.kh.mini_Project.model.Bank;

public class FinancialController { // ATM / BANK에서 좋아요를 누르면 Person vo에 담기는 로직
	//스캐너로 아래에서 검색 리스트 뽑기
	Scanner sc = new Scanner(System.in);
	
	//1.ArrayList로 지점 리스트 출력
	ArrayList<ATM> aList = new ArrayList<>();
    ArrayList<Bank> bankList = new ArrayList<>();
	
	public FinancialController() {}
	
	public ArrayList<Bank> BankListReader() {
		bankList.add(new Bank("KB국민은행 365(ATM)","AM : 07:00 ~ PM : 23:55","서울 서초구 서초동(강남역 10번 출구 294m)","image.PNG"));
		bankList.add(new Bank("신한은행 365(ATM)","AM : 07:00 ~ PM : 23:55","서울 서초구 서초동(강남역 8번 출구 500m)","image.PNG"));
	      bankList.add(new Bank("KB국민은행 강남대로", "서울 서초구 서초대로 411 2층 (서초동)","1599-9999","image.PNG"));
	      bankList.add(new Bank("신한은행 강남역금융센터점", "서울 서초구 서초대로 398","02-581-5055","image.PNG"));   
	      bankList.add(new Bank("IBK기업은행 강남역지점", "서울 서초구 강남대로 403 준빌딩","02-3481-2713","image.PNG"));
	      bankList.add(new Bank("KEB하나은행 강남역지점", "서울 서초구 강남대로 405","02-534-0312","image.PNG"));
	      bankList.add(new Bank("NH농협은행 역삼금융센터","서울 강남구 테헤란로 123 여삼빌딩 1층","0507-1355-4010","image.PNG"));
	      bankList.add(new Bank("우리은행 테헤란로금융센터","서울 강남구 테헤란로 124","02-553-6347","image.PNG"));
	      bankList.add(new Bank("한국씨티은행 강남영업부","서울 강남구 테헤란로 508 해성2빌딩","02-557-8400","image.PNG"));
	      bankList.add(new Bank("SC제일은행 강남역지점","서울 강남구 강남대로 406 GLASS TOWER","02-558-4041","image.PNG"));   
	      bankList.add(new Bank("서초중앙새마을금고 반포점","서울 서초구 반포대로 300-3 1층","02-535-2332","image.PNG"));
	      return bankList;
	   }


	public String searchbankList() {
		System.out.println("검색하기");
		System.out.print("은행명을 검색하세요 : ");
		String keyword = sc.nextLine();
		System.out.println(keyword);
		for (int j = 0; j < bankList.size(); j++) {
			if(bankList.get(j).getName().contains(keyword)) {
				System.out.println(bankList.get(j));
			}
		}
		return keyword;
	}

	public ArrayList<Bank> addBankKeep(String searchBank) {
		
		ArrayList<Bank> addBankList = new ArrayList<Bank>();
		Bank atm = new Bank();
		
		for (int i = 0; i < bankList.size(); i++) {
			if (bankList.get(i).getName().contains(searchBank)) {
				System.out.println(bankList.get(i));
				addBankList.add(bankList.get(i));
			}	
		}
		return addBankList;
	}
	
	
}
	
	
