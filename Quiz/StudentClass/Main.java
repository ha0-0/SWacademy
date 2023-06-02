package student_management;

import java.util.Scanner;

import com.java.dto.Student;

public class Main {

	public static void main(String[] args) {
		//학생정보(학번, 이름, 학년, 학과, 생년월일, 주소, 연락처, 상태)

		final int STUDENT_NUM;

		Scanner scann = new Scanner(System.in);

		System.out.print("학생 수>");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();

		Student[] stu = new Student[STUDENT_NUM];
		for(int i =0;i<STUDENT_NUM;i++) {
			stu[i] = new Student();
		}

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
					stu[i].studentNum = scann.nextLine();
				
					System.out.print("이름 ex)홍길동 > ");
					stu[i].name = scann.nextLine();
					
					System.out.print("학년 > ");
					stu[i].grade = scann.nextInt();scann.nextLine();

					System.out.print("학과 ex)정보통신공학 > ");
					stu[i].major = scann.nextLine();

					System.out.print("생년월일 ex)2023-05-26 > ");
					stu[i].birth = scann.nextLine();

					System.out.print("주소 (시/도 구/군 동/면) > ");
					stu[i].address = scann.nextLine();

					System.out.print("연락처 ex)010-1234-5678  > ");
					stu[i].contact = scann.nextLine();

					System.out.print("상태 ex)재학/졸업/휴학/재적 > ");
					stu[i].state = scann.nextLine();
					
					System.out.println("\n\n\n");
					System.out.println("학생등록 결과 화면");
					System.out.println("┌────────────────────────────────────────────────────┐");
					System.out.printf(" 1.학번     : %s\n", stu[i].studentNum);
					System.out.printf(" 2.이름     : %s\n", stu[i].name);
					System.out.printf(" 3.학년     : %d\n", stu[i].grade);
					System.out.printf(" 4.학과     : %s\n", stu[i].major);
					System.out.printf(" 5.생년월일 : %s\n", stu[i].birth);
					System.out.printf(" 6.주소     : %s\n", stu[i].address);
					System.out.printf(" 7.연락처   : %s\n", stu[i].contact);
					System.out.printf(" 8.상태     : %s\n", stu[i].state);
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
						hasData = hasData || (stu[i].studentNum!=null && stu[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),stu[i].studentNum,stu[i].name,stu[i].grade,stu[i].major,stu[i].state);
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
					System.out.printf(" 1.학번     : %s\n", stu[index-1].studentNum);
					System.out.printf(" 2.이름     : %s\n", stu[index-1].name);
					System.out.printf(" 3.학년     : %d\n", stu[index-1].grade);
					System.out.printf(" 4.학과     : %s\n", stu[index-1].major);
					System.out.printf(" 5.생년월일 : %s\n", stu[index-1].birth);
					System.out.printf(" 6.주소     : %s\n", stu[index-1].address);
					System.out.printf(" 7.연락처   : %s\n", stu[index-1].contact);
					System.out.printf(" 8.상태     : %s\n", stu[index-1].state);
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
						hasData = hasData || (stu[i].studentNum!=null && stu[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),stu[i].studentNum,stu[i].name,stu[i].grade,stu[i].major,stu[i].state);
					}
					System.out.print("수정학생 번호 (나가기:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q": case "Q":
						flag = false;
						continue;
					}

					boolean flag2 = true;
					
					int index = Integer.parseInt(num) -1;
					
					do {
						System.out.println("\n\n\n");
						System.out.println("학생조회 결과 화면");
						System.out.println("┌────────────────────────────────────────────────────┐");
						System.out.printf(" 1.학번     : %s\n", stu[index].studentNum);
						System.out.printf(" 2.이름     : %s\n", stu[index].name);
						System.out.printf(" 3.학년     : %d\n", stu[index].grade);
						System.out.printf(" 4.학과     : %s\n", stu[index].major);
						System.out.printf(" 5.생년월일 : %s\n", stu[index].birth);
						System.out.printf(" 6.주소     : %s\n", stu[index].address);
						System.out.printf(" 7.연락처   : %s\n", stu[index].contact);
						System.out.printf(" 8.상태     : %s\n", stu[index].state);
						System.out.println("└────────────────────────────────────────────────────┘");					
						System.out.print("수정 항목 선택 (나가기:q)> ");
						menu = scann.nextLine();
						
						switch(menu) {
						case "1":
							System.out.print("학번 > ");
							stu[index].studentNum = scann.nextLine();
							break;
						case "2":
							System.out.print("이름 > ");
							stu[index].name = scann.nextLine();
							break;
						case "3":
							System.out.print("학년 > ");
							stu[index].grade = scann.nextInt();scann.nextLine();
							break;
						case "4":
							System.out.print("학과 > ");
							stu[index].major = scann.nextLine();
							break;
						case "5":
							System.out.print("생년월일 > ");
							stu[index].birth = scann.nextLine();
							break;
						case "6":
							System.out.print("주소 > ");
							stu[index].address = scann.nextLine();
							break;
						case "7":
							System.out.print("연락처 > ");
							stu[index].contact = scann.nextLine();
							break;
						case "8":
							System.out.print("상태 > ");
							stu[index].state = scann.nextLine();
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
						hasData = hasData || (stu[i].studentNum!=null && stu[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),stu[i].studentNum,stu[i].name,stu[i].grade,stu[i].major,stu[i].state);
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
					
					stu[index].studentNum = "";
					stu[index].name = "";
					stu[index].grade = 0;
					stu[index].major = "";
					stu[index].birth = "";
					stu[index].address = "";
					stu[index].contact = "";
					stu[index].state = "";
					
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
