package student_management;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//학생정보(한번, 이름, 학년, 학과, 생년월일, 주소, 연락처, 상태)

		String[] studentNum;
		String[] name;
		int[] grade;
		String[] major;
		String[] birth;
		String[] address;
		String[] contact;
		String[] state;
		final int STUDENT_NUM;

		Scanner scann = new Scanner(System.in);

		System.out.print("학생 수>");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
		studentNum = new String[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		grade = new int[STUDENT_NUM];
		major = new String[STUDENT_NUM];
		birth = new String[STUDENT_NUM];
		address = new String[STUDENT_NUM];
		contact = new String[STUDENT_NUM];
		state = new String[STUDENT_NUM];

		String menu;

		do {
			System.out.println("┌────────────────────────────────────────────────────┐");
			System.out.println("│  1.학생등록 │ 2.학생조회 │ 3.학생수정 │ 4.학생삭제 │");
			System.out.println("└────────────────────────────────────────────────────┘");
			System.out.print("메뉴 (종료:q)>");
			menu = scann.nextLine();

			switch (menu) {
			case "1": //학생등록
				System.out.println("\n\n");
				System.out.println("┌────────────────────────────────────────────────────┐");
				System.out.println("│  1.학생등록                                        │");
				System.out.println("└────────────────────────────────────────────────────┘");
				for(int i=0;i<STUDENT_NUM;i++) {
					System.out.println("["+(i+1)+"번째 학생 정보 입력]");
					
					System.out.print("학번 ex)2305889001 > ");
					studentNum[i] = scann.nextLine();
				
					System.out.print("이름 ex)홍길동 > ");
					name[i] = scann.nextLine();
					
					System.out.print("학년 > ");
					grade[i] = scann.nextInt();scann.nextLine();

					System.out.print("학과 ex)정보통신공학 > ");
					major[i] = scann.nextLine();

					System.out.print("생년월일 ex)2023-05-26 > ");
					birth[i] = scann.nextLine();

					System.out.print("주소 (시/도 구/군 동/면) > ");
					address[i] = scann.nextLine();

					System.out.print("연락처 ex)010-1234-5678  > ");
					contact[i] = scann.nextLine();

					System.out.print("상태 ex)재학/졸업/휴학/재적 > ");
					state[i] = scann.nextLine();
					
					System.out.println("\n\n\n");
					System.out.println("학생등록 결과 화면");
					System.out.println("┌────────────────────────────────────────────────────┐");
					System.out.printf(" 1.학번     : %s\n", studentNum[i]);
					System.out.printf(" 2.이름     : %s\n", name[i]);
					System.out.printf(" 3.학년     : %d\n", grade[i]);
					System.out.printf(" 4.학과     : %s\n", major[i]);
					System.out.printf(" 5.생년월일 : %s\n", birth[i]);
					System.out.printf(" 6.주소     : %s\n", address[i]);
					System.out.printf(" 7.연락처   : %s\n", contact[i]);
					System.out.printf(" 8.상태     : %s\n", state[i]);
					System.out.println("└────────────────────────────────────────────────────┘");					
					System.out.print("아무키나 누르세요.");
					scann.nextLine();
				}
				break;
				
			case "2": //학생조회
				
				boolean flag = true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (studentNum[i]!=null && studentNum[i].length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),studentNum[i],name[i],grade[i],major[i],state[i]);
					}
					System.out.print("상세보기 번호 (나가기:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q": case "Q":
						flag = false;
						continue;
					}
					
					int index = Integer.parseInt(num);
					
					System.out.println("\n\n\n");
					System.out.println("학생조회 결과 화면");
					System.out.println("┌────────────────────────────────────────────────────┐");
					System.out.printf(" 1.학번     : %s\n", studentNum[index-1]);
					System.out.printf(" 2.이름     : %s\n", name[index-1]);
					System.out.printf(" 3.학년     : %d\n", grade[index-1]);
					System.out.printf(" 4.학과     : %s\n", major[index-1]);
					System.out.printf(" 5.생년월일 : %s\n", birth[index-1]);
					System.out.printf(" 6.주소     : %s\n", address[index-1]);
					System.out.printf(" 7.연락처   : %s\n", contact[index-1]);
					System.out.printf(" 8.상태     : %s\n", state[index-1]);
					System.out.println("└────────────────────────────────────────────────────┘");					
					System.out.print("아무키나 누르세요.");
					scann.nextLine();
					System.out.println("\n\n\n\n");
				}				
				break;
				
			case "3": //학생수정
				flag = true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (studentNum[i]!=null && studentNum[i].length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),studentNum[i],name[i],grade[i],major[i],state[i]);
					}
					System.out.print("수정학생 번호 (나가기:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q": case "Q":
						flag = false;
						continue;
					}

					boolean flag2 = true;
					
					int index = Integer.parseInt(num);
					index = index-1;
					do {
						System.out.println("\n\n\n");
						System.out.println("학생조회 결과 화면");
						System.out.println("┌────────────────────────────────────────────────────┐");
						System.out.printf(" 1.학번     : %s\n", studentNum[index]);
						System.out.printf(" 2.이름     : %s\n", name[index]);
						System.out.printf(" 3.학년     : %d\n", grade[index]);
						System.out.printf(" 4.학과     : %s\n", major[index]);
						System.out.printf(" 5.생년월일 : %s\n", birth[index]);
						System.out.printf(" 6.주소     : %s\n", address[index]);
						System.out.printf(" 7.연락처   : %s\n", contact[index]);
						System.out.printf(" 8.상태     : %s\n", state[index]);
						System.out.println("└────────────────────────────────────────────────────┘");					
						System.out.print("수정 항목 선택 (나가기:q)> ");
						menu = scann.nextLine();
						
						switch(menu) {
						case "1":
							System.out.print("학번 > ");
							studentNum[index] = scann.nextLine();
							break;
						case "2":
							System.out.print("이름 > ");
							name[index] = scann.nextLine();
							break;
						case "3":
							System.out.print("학년 > ");
							grade[index] = scann.nextInt();scann.nextLine();
							break;
						case "4":
							System.out.print("학과 > ");
							major[index] = scann.nextLine();
							break;
						case "5":
							System.out.print("생년월일 > ");
							birth[index] = scann.nextLine();
							break;
						case "6":
							System.out.print("주소 > ");
							address[index] = scann.nextLine();
							break;
						case "7":
							System.out.print("연락처 > ");
							contact[index] = scann.nextLine();
							break;
						case "8":
							System.out.print("상태 > ");
							state[index] = scann.nextLine();
							break;
						case "q": case "Q":
							System.out.println("학생수정을 종료합니다.");
							flag2=false;
							continue;
						default:
						}
					}while(flag2);
				}
				break;
				
			case "4": //학생삭제
				flag = true;
				while(flag) {
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (studentNum[i]!=null && studentNum[i].length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),studentNum[i],name[i],grade[i],major[i],state[i]);
					}
					System.out.print("삭제 학생 번호 (나가기:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q": case "Q":
						flag = false;
						continue;
					}
	
					boolean flag2 = true;
					
					int index = Integer.parseInt(num)-1;
					
					studentNum[index] = "";
					name[index] = "";
					grade[index] = 0;
					major[index] = "";
					birth[index] = "";
					address[index] = "";
					contact[index] = "";
					state[index] = "";
					
					System.out.printf("\n%d번 학생을 삭제했습니다. \n\n", (index+1));
					System.out.println("아무키나 누르세요.");
					scann.nextLine();
				}
				break;
				
			case "q":case "Q": //종료
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
			}

		} while (true);
	}

}
