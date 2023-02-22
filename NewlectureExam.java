package com.newlecture.spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewlectureExam implements Exam {

	@Value("20")
	private int math;
	private int eng;
	private int kor;
	private int com;
	
	public NewlectureExam() {
		// TODO Auto-generated constructor stub
	}
	
	public NewlectureExam(int math, int eng, int kor, int com) {
		super();
		this.math = math;
		this.eng = eng;
		this.kor = kor;
		this.com = com;
	}

	@Override
	public int total() {
		return math+eng+kor+com;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "NewlectureExam [math=" + math + ", eng=" + eng + ", kor=" + kor + ", com=" + com + "]";
	}

	
}
