/*
 * 	자바 => 기본현
 * 		 자바에 지원하는 데이터형
 * 		 논리형==> boolean => 값 : true/false : if(조건문)을 사용할떄 주로 사용하는 데이터형
 */
// =========> upcasting (자동형변환)
//	byte < short(char)< int < long < float < double
//		<=========== downcasting (강제형변환)
/*
 * 	double d='a';  ==> d=97.0
 * 	char c= 'a'
 * 	int i='A' ==> i=65
 * 
 * byte b1=10;
 * byte b2=20;
 * byte b3=b1+b2;
 * 
 * 		(int)10.5+(int)10.5 ==>20
 * 		(int)(10.5+10.5) ==> 21
 */
public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용방법
		boolean b= false; // 항상 소문자로 ==> 1byte
		System.out.println("b="+b);
		b= true;
		System.out.println("b="+b);

		
		System.out.println('홍');
		System.out.println((int)'홍');
		// 각문자는 숫자번호를 가지고 있다 (char는 정수형으로 인식한다)
	}

}
