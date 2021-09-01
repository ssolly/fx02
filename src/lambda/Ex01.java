package lambda;

import javafx.application.Application;
import javafx.stage.Stage;

interface Lambda01 {
	
	public void lam();	//추상화메소드
	
}

class Test01 implements Lambda01 {

	@Override
	public void lam() {
		
		System.out.println("lambda 01 실행");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Test01 t = new Test01();
		t.lam();
		
		//interface형 객체 생성
		Lambda01 lam01 = new Lambda01() {
			
			@Override
			public void lam() {
				System.out.println("인터페이스 객체 생성");
			}
		};
		lam01.lam();
		
		//lambda : 단 interface에 추상화메소드가 무조건 한개여야한다
		Lambda01 lam02 = ()-> System.out.println("람다식 객체 생성");
		lam02.lam();
	}
}
