package com.java.quiz;

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		
		String[] label = { "번호", "이름", "국어", "영어", "수학", "과학", "총점", "평균" };
		int[] num;
		String[] name;
//		int[] kor, eng, math, scien;
		int[][] score;
		int[] total;
		float[] avg;
		
		final int STUDENT_NUM;
		final int SCORE_NUM = 4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력 : ");
		STUDENT_NUM = scan.nextInt(); scan.nextLine();
		
		num = new int[STUDENT_NUM];
		name = new String[STUDENT_NUM];
//		kor = new int[STUDENT_NUM];
//		eng = new int[STUDENT_NUM];
//		math = new int[STUDENT_NUM];
//		scien = new int[STUDENT_NUM];
		score = new int[SCORE_NUM][STUDENT_NUM];
		
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		
		for (int i = 0; i < STUDENT_NUM; i++) {
			
			num[i] = i+1;
			System.out.printf("학생 %d번의 성적 data를 입력하시오.\n",num[i]);
			System.out.printf("학생 %d번 이름 : ",num[i]);
			name[i] = scan.nextLine();
			
//			kor[i] = score[0][i], eng[i] = score[1][i], math[i] = score[2][i], scien = score[3][i]
//			System.out.printf("학생 %d번 국어점수 : ",num[i]);		
//			score[0][i] = scan.nextInt(); scan.nextLine();
//			System.out.printf("학생 %d번 영어점수 : ",num[i]);
//			score[1][i] = scan.nextInt(); scan.nextLine();
//			System.out.printf("학생 %d번 수학점수 : ",num[i]);
//			score[2][i] = scan.nextInt(); scan.nextLine();
//			System.out.printf("학생 %d번 과학점수 : ",num[i]);
//			score[3][i] = scan.nextInt(); scan.nextLine();
			
			for(int scoreN=0;scoreN<SCORE_NUM;scoreN++) {
				System.out.printf("학생 %d번 %s점수 : ",num[i], label[scoreN+2]);
				score[scoreN][i] = scan.nextInt(); scan.nextLine();
				total[i] = total[i] + score[scoreN][i];
			}
			
//			total[i] = kor[i] + eng[i] + math[i] + scien[i];
			avg[i] = (total[i] * 10 / 4) / 10f;
		}
		
		
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
