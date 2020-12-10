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
	public static int cnt = 0; // ��ȸ��
	public static double avgSum = 0.0; // ��ü ���� ��� (�л� ������)
	public static double avg = 0.0; // ��� (�л� 1��)
	public static int sum = 0; // ����
	
	
	public void scoreSave() { 
		// �л����� ����, ����, ���� ������ �Է��ϸ� 
		// ���հ� ����� ���Ͽ� �����ϴ� �޼ҵ�
		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))) {
			
			while (true) {
				System.out.println("======������ �������� �Է��Ͻÿ�======");
				System.out.print("���� : ");
				int kor = sc.nextInt();
				System.out.print("���� : ");
				int eng = sc.nextInt();
				System.out.print("���� : ");
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
				
				System.out.println(++cnt + "��° �л� ���� ���");				
				
				System.out.println("��� �����Ͻðڽ��ϱ�? (y/n) : ");
				char goOn = sc.next().charAt(0);

				if (goOn == 'y') {
					avgSum += sum;
					continue;
				} else if (goOn == 'n') {
					System.out.println("score.txt ���Ͽ� ���� �Ϸ�");
					avgSum = avgSum / cnt;
					break;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
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
		// ����� ������ ���� �о�ͼ� �� �л��� ���� 
		// ������ ���� ����� �����
		// EOFException ������ �߻��ϴ� ����
		
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
			System.out.println("���� Ƚ��\t��ü ���� ���\t��ü ���"); 
			System.out.printf("%d\t%.1f\t%.1f\n", cnt, avgSum, avg);
			System.out.println("score.txt ���� �б� �Ϸ�!");				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
