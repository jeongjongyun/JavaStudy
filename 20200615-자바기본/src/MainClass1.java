
public class MainClass1 {
	public static void main(String[] args) {
		//표현 => 자바
		/*
		 * 정수
		 * 	= 10진법 10,20,...
		 * 	= 8진법 -->0으로 시작
		 * 		011	=> 9
		 * 		=
		 * 	= 16진법 -->0x로 시작
		 * 		0x10
		 * 		==
		 *  = 2진법 -->0b로 시작
		 *  	0b1010
		 *  	==
		 * 실수
		 * 	= 저장크기 => 4byte 10.5f
		 *  = 저장크기 => 8byte 10.5
		 * 문자
		 * 	= '' =>한글자만 저장
		 * 문자열
		 * 	= "" =>여러글자 저장
		 * 	ASC (c) ======> 1byte
		 * 	Unicode (자바)=> 2byte
		 * UTF-8
		 * 
		 */
		
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(10.5);
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		System.out.println(10);
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0xA);
		/*
		 * 	 1. 기본 문법
		 * 		===========
		 * 			=> 대소문자 구분
		 * 			=> 라이브러리(클래스 : 대소문자, 메소드는 소문자, 상수는 모두 대문자)
		 * 				PI= 3.14
		 * 
		 * 				변수/상수
		 * 
		 * 				int kor=100;  -->변수
		 * 				final int kor=200;   -->상수
		 * 			=> 명령문이 종료가 되면 반드시 ;(세미콜론 사용)
		 * 
		 * 		3. 들여쓰기!
		 */
		
	}

}
