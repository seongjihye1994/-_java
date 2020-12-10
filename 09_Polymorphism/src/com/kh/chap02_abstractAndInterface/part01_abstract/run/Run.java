package com.kh.chap02_abstractAndInterface.part01_abstract.run;

import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
//		Sports s = new Sports(); 
		// -> �߻� Ŭ�����δ� ��ü ���� �Ұ� (�̿ϼ� Ŭ�����̹Ƿ�)
		
		Sports s;
		// -> ��ü ������ �� �� ������ ���۷����δ� ��� ����!
		// ��, �������� �θ� Ÿ���� �ǰ� football�� basketball��
		// ����� �ڽ� Ŭ������ ������ �� ����
		s = new FootBall();
		
		// Sports ��ü �迭 �����
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new FootBall();
		
		// rule �޼ҵ� ȣ��
		for (int i = 0; i < arr.length; i++) {
			arr[i].rule();
			// ���� ���ε��� ���ؼ� �Ʊ� ������ �������̵� �� ������ �޼ҵ带 �ڵ����� ã�� ����
		}
		
		// for each
		for (Sports sp : arr) {
			sp.rule();
		}
		
		// �߻� Ŭ������ �� ����ϳ���?
		// �� �ڽ� Ŭ�������� ���� ���� �Ǿ�� �ϴ� ������ �ٸ�����
		// ������ ����(�޼ҵ��, �Ű�����, ������)���� ���� �Ǿ����� �� ��
		// �ڽ� Ŭ���������� ��� �޾� ������ �������̵��Ͽ� ������ ������
		// ���� �� �ְ� �� => ��Ӻ��� �������� �Ծ��� ����
		
		
			
			

	}

}
