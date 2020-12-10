package com.kh.mini_Project.controller;

import java.util.ArrayList;

import com.kh.mini_Project.dao.HotelDao;
import com.kh.mini_Project.model.Hotel;
import com.kh.mini_Project.model.Person;

public class HotelController {
	private ArrayList<Hotel> list = new ArrayList<>();
	private HotelDao hd = new HotelDao();
	
	public HotelController() {
		this.initialize();
	}
	
	public ArrayList<Hotel> selectList(){
		return list;
	}
	
	public ArrayList<Hotel> searchList(String input) {
		ArrayList<Hotel> search = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().contains(input)) {
				search.add(list.get(i));
			} else {
				System.out.println("�˻��Ͻ� ȣ���� �����ϴ�.");
			}
		}
		return search; 
	}

	/*public ArrayList<Hotel> addFavorite() {
		Person person = new Person();
		System.out.println("Hotel���ã��");
		ArrayList<Hotel> likeHotelList = addKeepHotel();
		
		// Health���ã�� -> Person ��ü�� �߰�
		person.setFavoriteHotel(likeHotelList);
		System.out.println("person ���ã�� ����");
		person.printLikeHotel();
		
		return likeHotelList;
	}*/
	
	public ArrayList<Hotel> loadDetail() {	
		ArrayList<Hotel> detail = new ArrayList<>();

		for(int i = 0; i < list.size(); i++) {
				detail.add(list.get(i));
				
		}
		return detail;
		
	}
	
	public void addList(Hotel hotel) {
		list.add(hotel);
		
	}
	public void loadHotelList() {
		list = hd.fileOpen();
	}
	
	public void saveHotelList() {
		hd.fileSave(list);
	}

	
	private void initialize() {
		// ȣ�ڸ���Ʈ ����
		Hotel[] hotel = new Hotel[15];
		// ��� ����
		String one = "��";
		String two = "�ڡ�";
		String thr = "�ڡڡ�";
		String fou = "�ڡڡڡ�";
		String fiv = "�ڡڡڡڡ�";
		// üũ��,üũ�ƿ� �ð� ����
		String ck1 = "üũ�� 15:00 / üũ�ƿ� 12:00";
		String ck2 = "üũ�� 15:00 / üũ�ƿ� 11:00";
		String ck3 = "üũ�� 14:00 / üũ�ƿ� 12:00";
		// ���� ����
		String park1 = "����(1��) 15,000��";
		String park2 = "����(1��) 10,000��";
		String park3 = "����(1��) 5,000��";
		String park4 = "����(1��) ����";
		String park5 = "���� �Ұ�";
		// 5
		hotel[0] = new Hotel("�ȴ��� ���� ����","292,500",fiv,"����Ư���� ������ ������ 854","02-2193-1234",ck1,park1,"10");
		hotel[1] = new Hotel("������Ƽ��Ż �׷��� �ĸ�����","192,000",fiv,"����Ư���� ������ �Ｚ1�� ������� 521","02-555-5656",ck1,park4,"3");
		hotel[2] = new Hotel("JW �޸���Ʈ ȣ�� ����","280,000",fiv,"����Ư���� ������ ���ʱ� �Ź����� 176","02-6282-6262",ck1,park1,"5");
		hotel[3] = new Hotel("��ũ �Ͼ�Ʈ ����","348,750",fiv,"����Ư���� ������ ������� 606"," 02-2016-1234",ck2,park2,"2");
		// 4
		hotel[4] = new Hotel("�۷��� ���� �ڿ��� ����","80,700",fou,"����Ư���� ������ ������� 610","02-6474-5000",ck1,park4,"6");
		hotel[5] = new Hotel("�Ŷ� ������ �Ｚ","148,000",fou,"����Ư���� ������ ������� 506","02-2175-9000",ck1,park2,"5");
		hotel[6] = new Hotel("��Ŭ���� ȣ�� ����","300,000",fou,"����Ư���� ���ʱ� ���ʵ� 1303-14","1899-9994",ck2,park1,"7");
		hotel[7] = new Hotel("�۷�����̺� ȣ��","196,000",fou,"����Ư���� ������ ������� 223","02-6177-5000",ck3,park4,"8");
		// 3
		hotel[8] = new Hotel("������ ���� ����","240,000",thr,"����Ư���� ������ ���ﵿ 603-1","02-548-5489",ck1,park2,"1");
		hotel[9] = new Hotel("ȣ�� ���׷� ����","228,600",thr,"����Ư���� ������ �Ż絿 ������ 153","02-542,2300",ck1,park2,"3");
		hotel[10] = new Hotel("�Ŷ����� ����","108,300",thr,"����Ư���� ���ʱ� ���ʵ� ȿ�ɷ� 42","02-2219,9000",ck2,park3,"5");
		// 2,1
		hotel[11] = new Hotel("���Ÿ ȣ��","57,000",two,"����Ư���� ������ ������� 712","02-545-0015",ck2,park1,"8");
		hotel[12] = new Hotel("���̿�Ƽ ȣ�� ����","68,000",two,"����Ư���� ���ʱ� ���� 3�� ȿ�ɷ� 53�� 49","02-522-2838",ck3,park2,"8");
		hotel[13] = new Hotel("���� ���Ƽ �Խ�Ʈ�Ͽ콺","47,800",one,"����Ư���� ������ ������ ������� 146�� 7-12","02-511-7422",ck1,park5,"11");
		hotel[14] = new Hotel("ȣ�� �Ҽ�","111,300",one,"����Ư���� ���ʱ� ���ʵ� ������� 14�� 53","02-507- 0505",ck2,park4,"5");
		
		for(int i = 0; i < hotel.length; i++) {
			this.addList(hotel[i]);
		}
		
		this.saveHotelList();
		
	}
	
	// Hotel ���ã�� ����
		public ArrayList<Hotel> addKeepHotel(ArrayList<Hotel> searchHotel) {
			ArrayList<Hotel> addHotelList = searchHotel;
			return addHotelList;
		}	


	
	

	
	
}