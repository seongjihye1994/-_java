package com.kh.mini_Project.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.mini_Project.model.Restaurant;

public class RestaurantsController {
	
	//��ĳ�ʷ� �Ʒ����� �˻� ����Ʈ �̱�
		Scanner sc = new Scanner(System.in);
		
		//1.ArrayList�� ���� ����Ʈ ���
		ArrayList<Restaurant> rList = new ArrayList<>();
		//ArrayList<ATM> aList = new ArrayList<>();
		 
		public ArrayList<Restaurant> restaurantListReader() {
			rList.add(new Restaurant("�����ٶ� ����","���� ������ ������� 96��2��", "0507-1343-9474","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("����" ,"���� ������ ������ 211 �������� 1F","0507-1436-0018","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("�̿��� ���μ��溻��","���� ������ �������156�� 32 1��","02-545-8250","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("���ʽ�����������","���� ������ �������98�� 16 �ĺ����º��� 6��","0507-1392-8886","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("�����̺ξ��б����ε�����","���� ������ ������157��25 2��","02-511-5982,","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("ȣ����","���� ���������ַ�164��39","0507-1399-3353,","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("��Ŀ���۴Ͼб�����","���ﰭ�������ַ�167��23","0507-1357-1456","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("�����趱����","���� ������ ������153��18","0507-1442-3312","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("���յ��������","���� ���������ַ�164��24��ũ�ν���1��","02-511-9451","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("�±���","���ﰭ�����б�����4��13-9 1��","02-545-7940","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("�ι�Ÿ���̺��","���ﰭ����������148��52����1��","0507-1324-8005","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("�˶� ������ ","���� ������ �������129 ����NŸ��1�� ","0507-1318-0939","11:00-21:00","image.PNG"));
			rList.add(new Restaurant("õ�̹�","���� ������ �������152��11���� ","0507-1304-7202","11:00-20:00","image.PNG")); 
			
			return rList;
		}
		/*public void ascRestaurantName() { 
			for(int i=0; i < rList.size(); i++) {
				System.out.println(rList.get(i));
			}
		}*/
	
		//�˻�â�� �̿��Ͽ� ���� ���ϴ� ��ϸ� ����ϰ� �����
		public void searchFinancialList() {
			
			System.out.print("�������� �˻��ϼ��� : ");
			String keyword = sc.nextLine();
			for(int j=0; j <rList.size(); j++) {
				if(rList.get(j).getfName().contains(keyword)) {
					System.out.println(rList.get(j));
				}
			}
		}
		
		
		// Restaurant ���ã�� ����
		/*public ArrayList<Restaurant> addKeepRestaurant(String searchRestaurant) {
			
			ArrayList<Restaurant> addRestaurantList = new ArrayList<Restaurant>();
			Restaurant restaurant = new Restaurant();
			
			for (int i = 0; i < rList.size(); i++) {
					if (rList.get(i).getfName().contains(searchRestaurant)) {
						System.out.println(rList.get(i));
						addRestaurantList.add(rList.get(i));
					}	
			}
			return addRestaurantList;
		}*/
		
		
}
