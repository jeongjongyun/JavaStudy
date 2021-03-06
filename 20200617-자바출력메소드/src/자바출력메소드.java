/*
 *	화면출력
 *		= System.out.println() => 다음줄에 출력
 *			ex)  System.out.println("Hello");
 *				 System.out.println("Java");
 *					=> Hello
 *					   Java
 *
 *		= System.out.print()
 *			ex)  System.out.print("Hello");
 *				 System.out.print("Java");
 *					=> HelloJava
 *
 *		= System.out.printf() => 서식이 있는 출력
 *				 System.out.println("80 80 80 240 80.0 B");
 *			ex)  System.out.printf("%5d%5d%5d%5d%5f%5c", 80,80,80,240,80.0,'B');
 *					=> %5d 80   => 앞에 세칸을 띄고 80을 출력 => ---80
 *					=>-%5d 80   => 뒤에 세칸을 띄고 80을 출력 => 80---
 *					=> %5.2f  80.0 => 5칸 중에 소숫점을 두자리를 쓰겠다 => -80.00
 *						**** %d: 정수, %f: 실수, %c: 문자, %s: 문자열
 *
 */
public class 자바출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.printf("%.1f",80.55);
		
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a+b);
		System.out.printf("%d*%d=%d",a,b,a*b);  //JDK 1.5부터사용가능
	}

}
