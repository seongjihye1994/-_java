package com.kh.music.controller;

import java.util.ArrayList;

import com.kh.music.model.dao.MusicDao;
import com.kh.music.model.vo.Music;

public class MusicController {
	
	public MusicController() {}
	
	private ArrayList<Music> list = new ArrayList<Music>();
	private MusicDao md = new MusicDao();
	
	public void addList(Music music) {
		list.add(music);
		// ���� ���Դ��� Ȯ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));			
		}
		
	}
	
	public ArrayList<Music> selectList() {
		return list;
	}


	public ArrayList<Music> searchArtist(String artist) {
		
		ArrayList<Music> search = new ArrayList<Music>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getArtist().equals(artist)) {
				search.add(list.get(i));
			}
		}
		
		return search;
	}
	
	public ArrayList<Music> searchTitle(String title) {
		
		ArrayList<Music> search = new ArrayList<Music>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				search.add(list.get(i));
			}
		}
		
		return search;
	}

	public int removeMusic(String title) {
		
		Music old = null;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				old = list.remove(i);
			}
		}
		
		int result = 0;
		
		if (old != null) {
			result = 1;
		}

		return result;
	}
	
	public int updateMusic(String title, Music updateMusic) {

		Music old = null; 
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				old = list.set(i, updateMusic);
			}
		}
		
		int result = 0; // old�� ���� ������ 0
		
		if (old != null) { // old�� ���� ���� 1
			result = 1;
		}

		return result;
	}

	public void loadMusicList() { // ���� ����
		list = md.fileOpen();
		
	}

	public void saveMusicList() { // ���� ����
		md.fileSave(list);
		
	}
	

}
