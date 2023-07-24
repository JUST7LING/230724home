package sungJuk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> arrayList
	 		= new ArrayList<SungJukDTO>();

	public void menu() throws InputMismatchException{
		Scanner scanner = new Scanner(System.in);
		int cont = 0;

		while(cont!= 6) {
			System.out.println("************************");
			System.out.println("\t1. 입력");
			System.out.println("\t2. 출력");
			System.out.println("\t6. 종료");
			System.out.println("************************");
			System.out.print("번호 : ");
			cont = scanner.nextInt();

			if(cont==6) break;
			switch(cont) {
			
			case 1: try { // getDTO() method throws Exception
					SungJukInsert insert = new SungJukInsert();
					arrayList = insert.getDTO(); // 입력한 정보를 가져온 것
					}catch(Exception e) {
						System.err.println("잘못된 입력값입니다.");
					}break;

			case 2: SungJukList list = new SungJukList();
					list.execute(arrayList);
					break;

			default: System.err.println("값이 잘못되었습니다.");
					 continue;
			}

		}// while
	}
}