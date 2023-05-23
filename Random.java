package com.java.quiz;

import java.util.Scanner;

public class Random {

		public static void main(String[] args) {
			
			int answer = 0;
			int input = 0;
			int gameoverNum = 1;
			int min, max, cnt;
			String gameover = " ";
			Scanner scan = new Scanner(System.in);
			
			System.out.println("******** 업다운 게임 ********\n\n");
			
			while(gameoverNum == 1){
				cnt = 0;
				min = 1;
				max = 100;
				answer = (int)(Math.random()*100+1);
				System.out.println("컴퓨터는 숫자를 결정했습니다.");
				System.out.println("시작하겠습니다.\n");
					
				while(input!=answer){
					System.out.printf("%d부터 %d 사이의 숫자를 입력하세요.",min,max);
					input = scan.nextInt();
					
					if(input<min||input>max) {
						System.out.println("입력이 올바르지 않습니다.");
					}
					else if(input<answer) {
						min = input+1;
						System.out.println("업!!!");
					}
					else if(input>answer) {
						max = input-1;
						System.out.println("다운!!!");
					}
					cnt++;
				}
				System.out.println("축하합니다. 정답입니다.");
				System.out.println(cnt+"번째 맞췄습니다.\n");
				System.out.println("게임을 종료하시겠습니까? (y/n)");
					
				gameover = scan.nextLine();
				switch(gameover) {
				case "Y":
				case "y": 
					gameoverNum = 0;
					System.out.println("게임을 종료합니다.");
					break;
				case "N":
				case "n":
					gameoverNum = 1;
					break;
				default:
					gameoverNum = 0;
					System.out.println("메뉴선택이 잘못 되었습니다.");
				};
				
				if (gameoverNum == 1) System.out.println("게임을 계속 진행합니다.\n");
			}
	}
}
