package com.java.quiz;

import java.util.Scanner;

public class ScoreArrayQuiz {

	public static void main(String[] args) {
		
		int[] num;
		String[] name;
		int[][] score;
		int[] total;
		float[] avg;
		String[] label;
		
		final int SCORE_NUM;
		final int STUDENT_NUM;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력 : ");
		STUDENT_NUM = scan.nextInt(); scan.nextLine();
		
		System.out.print("평가 과목수 : ");
		SCORE_NUM = scan.nextInt(); scan.nextLine();
		System.out.println();
		
		num = new int[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		score = new int[SCORE_NUM][STUDENT_NUM];
		
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		label = new String[SCORE_NUM+4];
		
		label[0]="번호";
		label[1]="이름";
		for(int i = 0;i<SCORE_NUM;i++) {
			System.out.printf("%d번 과목명 : ", i+1);
			label[i+2] = scan.nextLine();
			for(int scoreCnt=0;scoreCnt<i+1;scoreCnt++) {
				System.out.printf("%d.%s ",scoreCnt+1, label[scoreCnt+2]);
			}
			System.out.println();
		}
		label[SCORE_NUM+2]="총점";
		label[SCORE_NUM+3]="평균";
		
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < STUDENT_NUM; i++) {
			
			num[i] = i+1;
			System.out.printf("학생 %d번의 성적 data를 입력하시오.\n",num[i]);
			System.out.printf("학생 %d번 이름 : ",num[i]);
			name[i] = scan.nextLine();
			
			for(int scoreN=0;scoreN<SCORE_NUM;scoreN++) {
				System.out.printf("학생 %d번 %s점수 : ",num[i], label[scoreN+2]);
				score[scoreN][i] = scan.nextInt(); scan.nextLine();
				total[i] = total[i] + score[scoreN][i];
			}
			avg[i] = (total[i] * 10 / (float)SCORE_NUM) / 10f;
		}
		System.out.println("\n----------------------------------------------------");
		for (int i = 0; i < label.length; i++) {
			System.out.printf("%s\t", label[i]);
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d\t%s", num[i], name[i]);
			for(int scoreN=0;scoreN<SCORE_NUM;scoreN++) {
				System.out.printf("\t%d", score[scoreN][i]);
			}
			System.out.printf("\t%d\t%f\n", total[i], avg[i]);
		}

	}

}
