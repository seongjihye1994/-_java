package test.controller;

import java.util.ArrayList;

public class Test10 {

	public static void main(String[] args) {
		
		int [][] array = {{12, 41, 36, 56},
						{82, 10, 12, 61}, 
						{14, 16, 18, 78}, 
						{45, 26, 72, 23}}; 
		
		int col = array.length;
		int row = array[0].length;
		
		int[] copyAr = new int[col * row];
		
		for(int i = 0; i < array.length; i ++) {
			for(int j= 0; j < array[0].length; j ++) {
				copyAr[i * array[0].length + j] = array[i][j];
			}
		}
		
		ArrayList<Integer> copyArray = new ArrayList<Integer>();
		
		for (int i = 0; i < copyAr.length; i++) {
			if (!copyArray.contains(copyAr[i])) {
				copyArray.add(copyAr[i]);
			}
		}
		
		for (int i = 0; i < copyArray.size(); i++) {
			if (copyArray.get(i) % 3 == 0) {
				System.out.print(copyArray.get(i) + " ");			
			}		
		}
			
	}
	
	

}
