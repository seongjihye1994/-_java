package com.kh.hw2.run;

import com.kh.hw2.model.dao.ScoreProcess;

public class Run {

	public static void main(String[] args) {
		// ScoreProcess Ŭ���� ��ü ����
		// �� �� �޼ҵ带 ���������� ����

		ScoreProcess sp = new ScoreProcess();
		sp.scoreSave();
		sp.scoreRead();
	}

}
