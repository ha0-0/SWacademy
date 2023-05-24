package com.java.quiz;

import java.util.Scanner;

public class RockScissorPaper {

	public static void main(String[] args) {
		
		int computer = 0;
		String input = " ";
		boolean re = true;
		Scanner scan = new Scanner(System.in);
		
		while(re) {
			
			//computer 1 = 바위, 2 = 가위, 3 = 보
			computer = (int)(Math.random()*3+1);
			re = false;
			System.out.println("가위, 바위, 보 중 하나를 입력하세요");
			input = scan.nextLine();
		
			switch(input) {
			case "바위":
				if(computer==2) {System.out.println("컴퓨터: 가위\n이겼습니다!");}
				else if(computer==1) {System.out.println("컴퓨터: 바위\n비겼습니다!"); re=true;}
				else {System.out.println("컴퓨터: 보\n졌습니다ㅠ");}
				break;
			case "가위":
				if(computer==3) {System.out.println("컴퓨터: 보\n이겼습니다!");}
				else if(computer==2) {System.out.println("컴퓨터: 가위\n비겼습니다!"); re=true;}
				else {System.out.println("컴퓨터: 바위\n졌습니다ㅠ");}
				break;
			case "보":
				if(computer==1) {System.out.println("컴퓨터: 바위\n이겼습니다!");}
				else if(computer==3) {System.out.println("컴퓨터: 보\n비겼습니다!"); re=true;}
				else {System.out.println("컴퓨터: 가위\n졌습니다ㅠ");}
				break;
			default:
				System.out.println("잘못 입력했습니다."); 
				re=true;
			}
		}
	}

}

