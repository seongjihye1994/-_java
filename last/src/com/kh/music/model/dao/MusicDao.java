package com.kh.music.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.music.model.vo.Music;

public class MusicDao {
	
	public ArrayList<Music> fileOpen() { // �о���� Reader / Input
		ArrayList<Music> list = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("musicList.dat"))) {
			list = (ArrayList<Music>)ois.readObject(); // ���� ���ϵ� �� �ֻ��� Object�� ���ϵǱ� ������ �ٿ�ĳ���� �ؾ���
		} catch (IOException e) {
			System.out.println("musicList.dat ������ �ε����� ���߽��ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("ArrayList<Music>���� ĳ���� �� �� �����ϴ�,");
		}
		return list;
	}
	
	public void fileSave(ArrayList<Music> list) { // �����ϱ� Writer / Output
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("musicList.dat"))) {
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("musicList.dat ���� ���忡 �����Ͽ����ϴ�.");			
			e.printStackTrace();
		}
	}

}
