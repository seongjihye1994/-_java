package com.kh.mini_Project.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.mini_Project.model.ATM;
import com.kh.mini_Project.model.Bank;

public class FinancialController { // ATM / BANK���� ���ƿ並 ������ Person vo�� ���� ����
	//��ĳ�ʷ� �Ʒ����� �˻� ����Ʈ �̱�
	Scanner sc = new Scanner(System.in);
	
	//1.ArrayList�� ���� ����Ʈ ���
	ArrayList<ATM> aList = new ArrayList<>();
    ArrayList<Bank> bankList = new ArrayList<>();
	
	public FinancialController() {}
	
	public ArrayList<Bank> BankListReader() {
		bankList.add(new Bank("KB�������� 365(ATM)","AM : 07:00 ~ PM : 23:55","���� ���ʱ� ���ʵ�(������ 10�� �ⱸ 294m)","image.PNG"));
		bankList.add(new Bank("�������� 365(ATM)","AM : 07:00 ~ PM : 23:55","���� ���ʱ� ���ʵ�(������ 8�� �ⱸ 500m)","image.PNG"));
	      bankList.add(new Bank("KB�������� �������", "���� ���ʱ� ���ʴ�� 411 2�� (���ʵ�)","1599-9999","image.PNG"));
	      bankList.add(new Bank("�������� ����������������", "���� ���ʱ� ���ʴ�� 398","02-581-5055","image.PNG"));   
	      bankList.add(new Bank("IBK������� ����������", "���� ���ʱ� ������� 403 �غ���","02-3481-2713","image.PNG"));
	      bankList.add(new Bank("KEB�ϳ����� ����������", "���� ���ʱ� ������� 405","02-534-0312","image.PNG"));
	      bankList.add(new Bank("NH�������� �����������","���� ������ ������� 123 ������� 1��","0507-1355-4010","image.PNG"));
	      bankList.add(new Bank("�츮���� ������α�������","���� ������ ������� 124","02-553-6347","image.PNG"));
	      bankList.add(new Bank("�ѱ���Ƽ���� ����������","���� ������ ������� 508 �ؼ�2����","02-557-8400","image.PNG"));
	      bankList.add(new Bank("SC�������� ����������","���� ������ ������� 406 GLASS TOWER","02-558-4041","image.PNG"));   
	      bankList.add(new Bank("�����߾ӻ������ݰ� ������","���� ���ʱ� ������� 300-3 1��","02-535-2332","image.PNG"));
	      return bankList;
	   }


	public String searchbankList() {
		System.out.println("�˻��ϱ�");
		System.out.print("������� �˻��ϼ��� : ");
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
	
	
