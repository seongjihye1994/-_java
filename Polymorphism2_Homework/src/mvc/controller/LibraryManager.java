package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {

	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myPage() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		int idx = 0;
		Book[] bk = new Book[5];
		for (int i = 0; i < bList.length; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				bk[idx++] = bList[i];
			}
		} return bk;
	}
	
	public int rentBook(int index) {
		int result = 0;
		if (bList[index] instanceof AniBook) {
			if (((AniBook)bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook)bList[index]).isCoupon()) {
				mem.setCouponCount(1);
				result = 2;
			}
		} return result;
	}

	
	
	
	
	
}
