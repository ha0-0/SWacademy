package com.java.dto;

public class Score {
	// 필드 : 성적(학번, 이름, 국어, 영어, 수학, 과학, 총점, 평균)
	
	public static String school;
	public static String[] label;
	public int[] scores;
	public int stuNum;
	public String name;

	private final int SUBJECT_NUM;

	private int total;
	private float avg;

	// 생성자 : 필드 초기화
	public Score() {
		this(4);
	}

	public Score(int subjectNum) {

		SUBJECT_NUM = subjectNum;

		label = new String[subjectNum + 4];
		label[0] = "번호";
		label[1] = "이름";
		label[label.length - 2] = "총점";
		label[label.length - 1] = "평균";

		scores = new int[subjectNum];
	}

	public void total() {
		for (int i = 0; i < SUBJECT_NUM; i++) {
			this.total += scores[i];
		}
		this.total *= 10;
	}

	public void avg() {
		this.avg = total / SUBJECT_NUM / 10f;
	}

	public int getTotal() {
		return this.total / 10;
	}

	public float getAvg() {
		return this.avg;
	}

	public String outputScore() {
		String output = "";
		for (int i = 0; i < SUBJECT_NUM; i++) {
			output += scores[i] + "\t";
		}
		return output;
	}

}
