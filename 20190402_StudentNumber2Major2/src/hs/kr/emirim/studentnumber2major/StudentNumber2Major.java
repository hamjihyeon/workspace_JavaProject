package hs.kr.emirim.studentnumber2major;

import java.util.Scanner;

public class StudentNumber2Major {

	public static void main(String[] args) {
		// 학번 입력받자
		Scanner scanner = new Scanner(System.in);
		System.out.println("학과를 구할 학번을 입력하세요");
		String studentNumber = scanner.nextLine();
		String grade = studentNumber.substring(0,1);
		char gradeCh = studentNumber.charAt(0);
		String classroom = studentNumber.substring(1,2);
		char classroomCh = studentNumber.charAt(1);
		
		//학과 출력하자

		//	학년이 1,2면
		if(grade.equals("1") || grade.equals("2")) {
			//	반이 1,2이면 "뉴미디어소프트웨어과"
			if(classroom.equals("1") || classroom.equals("2")) {
				System.out.println("뉴미디어소프트웨어과");
				//	반이 3,4이면 "뉴미디어웹솔루션과"
			} else if(classroom.equals("3") || classroom.equals("4")) {
				System.out.println("뉴미디어솔루션과");
				//	반이 5,6이면 "뉴미디어디자인과"
			} else if(classroom.equals("5") || classroom.equals("6")) {
				System.out.println("뉴미디어디자인과");
			}
		}
		
		//	학년이 3면
		else if(gradeCh == '3') {
			switch(classroomCh) {
			case '1':
			case '2':
				//		반이 1,2이면 "뉴미디어인터렉티브과"
				System.out.println("뉴미디어인터렉티브과");
				break;
			case '3':
			case '4':
				//	반이 3,4이면 "뉴미디어디자인과"
				System.out.println("뉴미디어디자인과");
				break;

			case '5':
			case '6':
				//	반이 5,6이면 "뉴미디어솔루션과"
				System.out.println("뉴미디어솔루션과");
				break;
			
		default:
			break;
	}
		}

	}

}
