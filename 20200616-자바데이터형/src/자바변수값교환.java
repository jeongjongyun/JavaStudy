
/*
 * 1. 데이터형(자료형)
 * 		정수, 실수, 문자, 논리 
 * 
 * 		총알 ==> x.y => 좌표(int) ==>
 * 		키보드 값 ==> char
 * 		
 * 		총점수를 누적 ==> long
 * 		점수에 대한 평균 ==> 소수점필요 ==> double 
 * 
 * 		게임 종료 여부 확인 ==> true/false ==>boolean
 * 	========================================
 *
 * 2. 데이터 저장 방법
 * 		= 한개 저장 
 * 			==>변경해서 사용 데이터 : 변수 => 데이터형 변수명
 * 			==>변경하지 않는 데이터 : 상수 => final 데이터형 변수명
 * 		= 여러개 저장 ====> 같은 유형 (배열)
 * 		= 여러개 저장 ====> 다른 유형 (클래스) ==> 사용자 정의 데이터형
 *
 * 3. 메모리를 만드는 방식 => 변수선언
 * 				데이터형 변수명;
 * 			ex) 정수 
 * 				  int ==> int a;
 * 				  long ==> long a;
 * 				실수
 * 				  double ==> double d;
 * 				문자
 * 				  char ==> char c;
 * 				논리
 * 				  boolean ==> boolean b;
 * 
 *	4. 변수에 대한 초기값
 *		int a= 0;
 *		long a=0L;
 *		double a =0.0;
 *		boolean b=false;
 *		char c= 'A';
 *
 *
 *	5.변수값을 변경하는 방법
 *		int a=10;
 *		
 *		a=100;
 *		a=200;
 *		a=300;
 *
 *	6. 변수와 변수의 교환
 *		temp라는 입시변수가 필요하다
 *
 *	7. 25page 참조
 *		===========
 *		변수명을 만들떄 사용하는 방법 (식별자)
 *			변수명 제작
 *			1) 알파벳이나 한글로 시작한다  (알파벳은 반드시 대소문자 구분 -> a와 A는 다름)
 *			2) 숫자 사용이 가능 (단, 앞에는 사용할 수 없다)  ==> a1,a2 ....// 1a(error)
 *			3) 특수문자 사용이 가능 ( _ , $ ) 
 *				_ => 임시파일, 단어가 여러개 일 경우에 주로 사용  ==> ex) file_size , file_name...
 *			4) 키워드(자바에서 사용중인 단어)는 사용할 수 없다.  ==> 빨간글씨 ( public class, public class void)
 *			5) 변수의 길이는 15자 이내로 한다 (평균 3~7자)
 */
public class 자바변수값교환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =100;
		int y =200;
		int temp=x; 
		x=y;    // y=200  ==> x=y ==> x=200
		
		y=temp;  //y=x ==> x=200 ===> y=200
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}

}
