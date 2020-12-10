package com.kh.music.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.music.model.vo.Music;

public class MusicDao {
	
	public ArrayList<Music> fileOpen() { // 읽어오기 Reader / Input
		ArrayList<Music> list = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("musicList.dat"))) {
			list = (ArrayList<Music>)ois.readObject(); // 값이 리턴될 때 최상위 Object로 리턴되기 떄문에 다운캐스팅 해야함
		} catch (IOException e) {
			System.out.println("musicList.dat 파일을 로드하지 못했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("ArrayList<Music>으로 캐스팅 할 수 없습니다,");
		}
		return list;
	}
	
	public void fileSave(ArrayList<Music> list) { // 저장하기 Writer / Output
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("musicList.dat"))) {
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("musicList.dat 파일 저장에 실패하였습니다.");			
			e.printStackTrace();
		}
	}

}
