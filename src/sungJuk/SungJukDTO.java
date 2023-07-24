package sungJuk;

import java.util.ArrayList;

public class SungJukDTO {
	private int no, tot, kor, eng, math;
	// tot => 총점, kor => 국어, eng => 영어, math => 수학 점수
	private double avg;
	// avg => 평균
	private String name;
	// 학생의 이름
	
	public SungJukDTO() {
		
		// default 생성자
	}
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	//	calc();
	}
	
	public SungJukDTO(int no, String name, int kor, int eng, int math, int tot, double avg) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}

	public void calc() {
		tot = kor + eng + math;
		avg = (double) tot/3;

	}
	
	public int calc(int kor, int eng, int math) {
		tot = kor + eng + math;
		return tot;
	//	avg = (double) tot/3;
	}
	
	public double calc(int tot) {
		
		avg = (double) tot/3;
		return avg;
	}


	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}