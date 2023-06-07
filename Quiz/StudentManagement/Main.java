package student_management;

import java.util.Scanner;

import com.java.dto.Student;
import com.java.dto.StudentId;

public class Main {

	public static void main(String[] args) {
		//학생정보(학번, 이름, 학년, 학과, 생년월일, 주소, 연락처, 상태)

		StudentId[] students;
		final int STUDENT_NUM;

		Scanner scann = new Scanner(System.in);

		System.out.print("학생 수>");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
		students = new StudentId[STUDENT_NUM];
		for(int i =0;i<STUDENT_NUM;i++) {
			students[i] = new StudentId();
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
					students[i].studentNum = scann.nextLine();
				
					System.out.print("이름 ex)홍길동 > ");
					students[i].name = scann.nextLine();
					
					System.out.print("학년 > ");
					students[i].grade = scann.nextInt();scann.nextLine();

					System.out.print("학과 ex)정보통신공학 > ");
					students[i].major = scann.nextLine();

					System.out.print("생년월일 ex)2023-05-26 > ");
					students[i].birth = scann.nextLine();

					System.out.print("주소 (시/도 구/군 동/면) > ");
					students[i].address = scann.nextLine();

					System.out.print("연락처 ex)010-1234-5678  > ");
					students[i].contact = scann.nextLine();

					System.out.print("상태 ex)재학/졸업/휴학/재적 > ");
					students[i].state = scann.nextLine();
					
					System.out.print("아이디 > ");
					students[i].id = scann.nextLine();
					
					System.out.print("비밀번호 > ");
					students[i].password = scann.nextLine();
					
					System.out.println("\n\n\n");
					System.out.println("학생등록 결과 화면");
					System.out.println("┌────────────────────────────────────────────────────┐");
					System.out.printf(" 1.학번     : %s\n", students[i].studentNum);
					System.out.printf(" 2.이름     : %s\n", students[i].name);
					System.out.printf(" 3.학년     : %d\n", students[i].grade);
					System.out.printf(" 4.학과     : %s\n", students[i].major);
					System.out.printf(" 5.생년월일 : %s\n", students[i].birth);
					System.out.printf(" 6.주소     : %s\n", students[i].address);
					System.out.printf(" 7.연락처   : %s\n", students[i].contact);
					System.out.printf(" 8.상태     : %s\n", students[i].state);
					System.out.printf(" 8.아이디   : %s\n", students[i].id);
					System.out.printf(" 8.비밀번호 : %s\n", students[i].password);
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
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태\t아이디");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,students[i].major,students[i].state,students[i].id);
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
					System.out.printf(" 1.학번     : %s\n", students[index-1].studentNum);
					System.out.printf(" 2.이름     : %s\n", students[index-1].name);
					System.out.printf(" 3.학년     : %d\n", students[index-1].grade);
					System.out.printf(" 4.학과     : %s\n", students[index-1].major);
					System.out.printf(" 5.생년월일 : %s\n", students[index-1].birth);
					System.out.printf(" 6.주소     : %s\n", students[index-1].address);
					System.out.printf(" 7.연락처   : %s\n", students[index-1].contact);
					System.out.printf(" 8.상태     : %s\n", students[index-1].state);
					System.out.printf(" 9.아이디   : %s\n", students[index-1].id);
					System.out.printf(" 10.비밀번호: %s\n", students[index-1].password);
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
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태\t아이디");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,students[i].major,students[i].state,students[i].id);
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
						System.out.printf(" 1.학번     : %s\n", students[index].studentNum);
						System.out.printf(" 2.이름     : %s\n", students[index].name);
						System.out.printf(" 3.학년     : %d\n", students[index].grade);
						System.out.printf(" 4.학과     : %s\n", students[index].major);
						System.out.printf(" 5.생년월일 : %s\n", students[index].birth);
						System.out.printf(" 6.주소     : %s\n", students[index].address);
						System.out.printf(" 7.연락처   : %s\n", students[index].contact);
						System.out.printf(" 8.상태     : %s\n", students[index].state);
						System.out.printf(" 9.아이디   : %s\n", students[index].id);
						System.out.printf(" 10.비밀번호: %s\n", students[index].password);
						System.out.println("└────────────────────────────────────────────────────┘");					
						System.out.print("수정 항목 선택 (나가기:q)> ");
						menu = scann.nextLine();
						
						switch(menu) {
						case "1":
							System.out.print("학번 > ");
							students[index].studentNum = scann.nextLine();
							break;
						case "2":
							System.out.print("이름 > ");
							students[index].name = scann.nextLine();
							break;
						case "3":
							System.out.print("학년 > ");
							students[index].grade = scann.nextInt();scann.nextLine();
							break;
						case "4":
							System.out.print("학과 > ");
							students[index].major = scann.nextLine();
							break;
						case "5":
							System.out.print("생년월일 > ");
							students[index].birth = scann.nextLine();
							break;
						case "6":
							System.out.print("주소 > ");
							students[index].address = scann.nextLine();
							break;
						case "7":
							System.out.print("연락처 > ");
							students[index].contact = scann.nextLine();
							break;
						case "8":
							System.out.print("상태 > ");
							students[index].state = scann.nextLine();
							break;
						case "9":
							System.out.print("아이디 > ");
							students[index].id = scann.nextLine();
							break;
						case "10":
							System.out.print("비밀번호 > ");
							students[index].password = scann.nextLine();
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
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("입력된 학생정보가 없습니다.\n\n\n");
						break;
					}
					
					System.out.println("순번\t학번\t이름\t학년\t학과\t상태\t아이디");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,students[i].major,students[i].state,students[i].id);
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
					
					students[index].studentNum = "";
					students[index].name = "";
					students[index].grade = 0;
					students[index].major = "";
					students[index].birth = "";
					students[index].address = "";
					students[index].contact = "";
					students[index].state = "";
					students[index].id = "";
					students[index].password = "";
					
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
