package com.kh.hw2.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScoreProcess {
	
	public ScoreProcess() {}
	
	public static Scanner sc = new Scanner(System.in);
	public static int cnt = 0; // 조회수
	public static double avgSum = 0.0; // 전체 총점 평균 (학생 여러명)
	public static double avg = 0.0; // 평균 (학생 1명)
	public static int sum = 0; // 총점
	
	
	public void scoreSave() { 
		// 학생별로 국어, 영어, 수학 성적을 입력하면 
		// 총합과 평균을 파일에 저장하는 메소드
		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))) {
			
			while (true) {
				System.out.println("======다음의 성적들을 입력하시오======");
				System.out.print("국어 : ");
				int kor = sc.nextInt();
				System.out.print("영어 : ");
				int eng = sc.nextInt();
				System.out.print("수학 : ");
				int math = sc.nextInt();
				
				sum = kor + eng + math;
				avg = sum / 3.0;
				
				dout.writeInt(kor);
				dout.writeInt(eng);
				dout.writeInt(math);
				dout.writeInt(sum);
				dout.writeDouble(avgSum);
				dout.writeDouble(avg);
				dout.writeUTF("\n");
				
				System.out.println(++cnt + "번째 학생 정보 기록");				
				
				System.out.println("계속 저장하시겠습니까? (y/n) : ");
				char goOn = sc.next().charAt(0);

				if (goOn == 'y') {
					avgSum += sum;
					continue;
				} else if (goOn == 'n') {
					System.out.println("score.txt 파일에 저장 완료");
					avgSum = avgSum / cnt;
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void scoreRead() {
		// 저장된 성적을 토대로 읽어와서 각 학생별 과목별 
		// 점수와 총점 평균을 출력함
		// EOFException 에러가 발생하는 로직
		
		try (DataInputStream din = new DataInputStream(new FileInputStream("score.txt"))) {
			while (true) {
				
				din.readInt(); // kor
				din.readInt(); // eng
				din.readInt(); // math
				din.readInt(); // sum
				din.readDouble(); // avgSum
				din.readDouble(); // avg

			} 
		} catch (EOFException e) {
			System.out.println("읽은 횟수\t전체 총점 평균\t전체 평균"); 
			System.out.printf("%d\t%.1f\t%.1f\n", cnt, avgSum, avg);
			System.out.println("score.txt 파일 읽기 완료!");				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
