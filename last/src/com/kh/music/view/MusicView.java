package com.kh.music.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.kh.music.controller.MusicController;
import com.kh.music.model.comparator.AscTitle;
import com.kh.music.model.comparator.DescArtist;
import com.kh.music.model.comparator.DescTitle;
import com.kh.music.model.vo.Music;

public class MusicView {
	
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		// 프로그램 시작 될 때 저장 되어 있는 뮤직리스트 파일 읽어오기
		mc.loadMusicList();
		
		System.out.println("******* 메인 메뉴 *******");
		System.out.println();
		
		while (true) {
			
			System.out.println("1. 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 정렬하여 조회");
			System.out.println("4. 가수명으로 검색");
			System.out.println("5. 곡명으로 검색");
			System.out.println("6. 곡 정보 수정");
			System.out.println("7. 곡 삭제");
			System.out.println("0. 종료");
			
			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			int inputMenu = sc.nextInt();
			
			if (inputMenu == 0) break;
			
			switch (inputMenu) {
			case 1: addList(); break;
			case 2: selectList(); break;
			case 3: sortMenu(); break;
			case 4: searchArtist(); break;
			case 5: searchTitle(); break;
			case 6: updateMusic(); break;
			case 7: removeMusic(); break;
			case 0: System.out.println("프로그램 종료");
			// 프로그램 종료 될 때 뮤직 리스트 파일로 저장
			mc.saveMusicList(); break;
			default: System.out.println("잘못 입력하셨습니다."); continue;
			
			
			}
			
		}
		
	}
	
	
	public void sortMenu() {
		
		System.out.println("******* 정렬용 메뉴 *******");
		System.out.println();
	
		System.out.println("1. 가수명 별 오름차순 정렬");
		System.out.println("2. 곡명 별 오름차순 정렬");
		System.out.println("3. 가수명 별 내림차순 정렬");
		System.out.println("4. 곡명 별 내림차순 정렬");
		
		System.out.println();
		System.out.print("메뉴 번호 선택 : ");
		int menu = sc.nextInt();
		
		ascDesc(menu);

	}
	
	
	public void addList() {

		System.out.println("-------- 새로운 곡 추가 --------");
		System.out.print("가수를 입력해주세요. : ");
		String artist = sc.next(); 
		System.out.print("제목을 입력해주세요. : ");
		String title = sc.next();
		
		Music newMusic = new Music(artist, title);
		System.out.println("곡 추가 완료!");
		
		mc.addList(newMusic);
		
	}
	
	public void selectList() {
		
		System.out.println("-------- 전체 곡 목록 조회 --------");
		
		ArrayList<Music> musicList = (ArrayList<Music>) mc.selectList();
			
		if (musicList.isEmpty()) System.out.println("목록이 존재하지 않습니다.");
		
		for (int i = 0; i < musicList.size(); i++) {
			System.out.println(musicList.get(i));
		}
		
	}
	
	public void ascDesc(int num) {
		
		System.out.println("-------- 정렬하여 조회 --------");
		
		ArrayList<Music> sortList = new ArrayList<Music>(); 
		
		sortList.addAll(mc.selectList());
		
		if (num == 1) Collections.sort(sortList);
		else if (num == 2) Collections.sort(sortList, new AscTitle());
		else if (num == 3) Collections.sort(sortList, new DescArtist());
		else Collections.sort(sortList, new DescTitle());

		for (int i = 0; i < sortList.size(); i++) {
			System.out.println(sortList.get(i));
		}
	
		
	}
	
	public void searchArtist() {

		System.out.println("-------- 가수명으로 검색 --------");
		System.out.print("검색할 곡의 가수명을 입력하시오. : ");
		String artist = sc.next();
		
		ArrayList<Music> sa = mc.searchArtist(artist);
		
		if (sa == null) System.out.println("검색한 곡이 없습니다.");
		else System.out.println(sa);

	}
	
	public void searchTitle() {

		System.out.println("-------- 곡명으로 검색 --------");
		
		System.out.print("검색할 곡의 제목을 입력하시오. : ");
		String title = sc.next();
		
		ArrayList<Music> sa = mc.searchTitle(title);
		
		if (sa == null) System.out.println("검색한 곡이 없습니다.");
		else System.out.println(sa);
		
	}
	
	public void updateMusic() {
		
		System.out.println("-------- 곡 정보 수정 --------");
		
		System.out.print("수정할 곡의 제목을 입력하시오. : ");
		String title = sc.next();
		
		System.out.print("수정할 가수명 : ");
		String updateArtist = sc.next();
		System.out.print("수정할 제목명 : ");
		String updateTitle = sc.next();
		
		Music updateMusic = new Music(updateArtist, updateTitle);
		
		int result = mc.updateMusic(title, updateMusic);
		
		if (result > 0) System.out.println("성공적으로 수정되었습니다.");
		else System.out.println("수정할 곡을 찾지 못했습니다.");

	}
	
	public void removeMusic() {
		
		System.out.println("-------- 곡 삭제 --------");
		
		System.out.print("삭제할 곡의 제목을 입력하시오. : ");
		String title = sc.next();
		
		int result = mc.removeMusic(title);

		if (result > 0) System.out.println("성공적으로 수정되었습니다.");
		else System.out.println("수정할 곡을 찾지 못했습니다.");

	}
	

}