package com.java.main;

import java.util.Scanner;

import com.java.dto.Score;

public class Main {

	public static void main(String[] args) {
        
		final int SUBJECT_NUM;
		final int STUDENT_NUM;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력 : ");
		STUDENT_NUM = scan.nextInt(); scan.nextLine();
		
		System.out.print("평가 과목수 : ");
		SUBJECT_NUM = scan.nextInt(); scan.nextLine();
		System.out.println();
		
		Score[] score = new Score[STUDENT_NUM];
		
		for(int i =0;i<STUDENT_NUM;i++) {
			score[i] = new Score(SUBJECT_NUM);
		}
		
		for(int i = 0;i<SUBJECT_NUM;i++) {
			System.out.printf("%d번 과목명 : ", i+1);
			Score.label[i+2] = scan.nextLine();
			for(int scoreCnt=0;scoreCnt<i+1;scoreCnt++) {
				System.out.printf("%d.%s ",scoreCnt+1, Score.label[scoreCnt+2]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < STUDENT_NUM; i++) {
		
			System.out.println();
			score[i].stuNum = i+1;
			System.out.printf("학생 %d번의 성적 data를 입력하시오.\n",score[i].stuNum);
			System.out.printf("학생 %d번 이름 : ",score[i].stuNum);
			score[i].name = scan.nextLine();
			
			for(int scoreN=0;scoreN<SUBJECT_NUM;scoreN++) {
				System.out.printf("학생 %d번 %s점수 : ",score[i].stuNum, score[i].label[scoreN+2]);
				score[i].scores[scoreN] = scan.nextInt(); scan.nextLine();
			}
			
			score[i].total();
			score[i].avg();
		}
		
		//출력
		System.out.println("\n");
		for (int i = 0; i < Score.label.length; i++) {
			System.out.printf("%s\t", Score.label[i]);
		}
		System.out.println("\n---------------------------------------------------------------------");

		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println(score[i].stuNum +"\t"+ score[i].name +"\t"+ score[i].outputScore() + score[i].getTotal() +"\t"+ score[i].getAvg());
		}		
	}

}
