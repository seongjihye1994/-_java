package com.kh.library.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.library.model.vo.Book;

public class BookManager {
	
	public BookManager() {}
	
	HashMap<Integer, Book> bookMap = new HashMap<>();
	
	public void insertBook(Book book) {
				
		int lastNo = 0;
		
		Set<Integer> keySet = bookMap.keySet();
		
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()) {
			Integer key = it.next(); // Å°°ª
			
			if (!it.hasNext()) {
				lastNo = key + 1;				
			}
	
		}
		
		bookMap.put(lastNo, book);
		System.out.println(bookMap);
	}
	
	public HashMap<Integer, Book> selectMap() {
		
		return bookMap;
	}
	
	public int deleteBook(int bNo) {
		
		Set<Integer> keySet = bookMap.keySet();
		
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			
			if (key == bNo) {
				it.remove();
				return 1;
			}
		} 
		
		return 0;
	}
	
	public HashMap<Integer, Book> searchBook(String title) {
		
		HashMap<Integer, Book> searchMap = new HashMap<Integer, Book>();
		
		Set<Entry<Integer, Book>> entrySet = bookMap.entrySet();
		
		Iterator<Entry<Integer, Book>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<Integer, Book> entry = it.next();
			
			if (entry.getValue().getTitle().equals(title)) {
				searchMap.put(entry.getKey(), entry.getValue());
			}
				
		}
		
		return searchMap;
	}

}
