package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SungJukSort implements SungJuk {
	
	public SungJukSort() {
		menu();
	}
	
	
	public void menu() {
		ArrayList<SungJukDTO> arrayList = new ArrayList<>();
		int cont = 0;
		Scanner scanner = new Scanner(System.in);
		while(cont!= 3) {
			System.out.println("************************");
			System.out.println("\t1. 총점으로 내림차순");
			System.out.println("\t2. 이름으로 오름차순");
			System.out.println("\t3. 이전 메뉴로 돌아가기");
			System.out.println("************************");
			System.out.print("번호 : ");
			cont = scanner.nextInt();
			
			/*
			else if(cont==2) {
				System.out.println("서비스 준비중입니다.");
			}
			else if(cont==1) {
				execute(arrayList);
			}
			else {
				System.out.println("값이 잘못되었습니다.");
				continue;
			}
			*/

			if(cont==3) break;
			
			switch(cont) {
			
			case 1: {execute(arrayList);
//					SungJukList list = new SungJukList();
//					list.execute(arrayList);
					for (SungJukDTO sungJukDTO : arrayList)
					System.out.println(sungJukDTO);
					break;}
			
			case 2:{System.out.println("서비스 준비중입니다.");
					System.out.println();
					continue;}
			
			default: {System.out.println("값이 잘못되었습니다.");
					 continue;}
			}// switch
			

		}// while
		
	}

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		
		System.out.println();
		System.out.println("Execute 실행");
		Collections.sort(arrayList);
//		for(SungJukDTO sungJukDTO : arrayList) {
//			System.out.println(sungJukDTO);
//		}
//		System.out.println("Execute 실행 끝");
	//	printList(arrayList);
		
	}
	
	public void printList(ArrayList<SungJukDTO> arrayList) {
//		for(SungJukDTO sungJukDTO : arrayList) {
//			System.out.println(sungJukDTO);
//		}
		SungJukList list = new SungJukList();
		list.execute(arrayList);
		System.out.println("Execute 실행 끝");
	}

}