package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		SungJuk sungJuk = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String findName = scanner.nextLine();
		int found = 0; // 찾은 횟수를 저장
		
		
		for (int i = 0; i<arrayList.size(); i++) {
			if(findName.equals (arrayList.get(i).getName())) {
				found++;
				arrayList.remove(i);
			}//if
			
		}//for
		foundPrint(found);
		
		if(found==0) {
			System.out.println("회원의 정보가 없습니다.");
		}
		if(found!=0) { // 동명이인이 있다
			for (int i = 0; i<found; i++) {
				for (int j = 0; j<arrayList.size(); j++) {
					if(findName.equals (arrayList.get(j).getName())) {
						found++;
						arrayList.remove(j);
					}//if
				}//for
			}//for 
					
			if(found>1)
				System.out.println("삭제하였습니다.");
			// 메시지 중복 출력을 막기 위함
		}
	}//execute
	
	public void foundPrint(int found) {
		if(found==1) {
			System.out.println("삭제하였습니다.");
		}
		else {
			return;
		}
	}

}