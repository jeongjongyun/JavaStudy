/*
 *	ȭ�����
 *		= System.out.println() => �����ٿ� ���
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
 *		= System.out.printf() => ������ �ִ� ���
 *				 System.out.println("80 80 80 240 80.0 B");
 *			ex)  System.out.printf("%5d%5d%5d%5d%5f%5c", 80,80,80,240,80.0,'B');
 *					=> %5d 80   => �տ� ��ĭ�� ��� 80�� ��� => ---80
 *					=>-%5d 80   => �ڿ� ��ĭ�� ��� 80�� ��� => 80---
 *					=> %5.2f  80.0 => 5ĭ �߿� �Ҽ����� ���ڸ��� ���ڴ� => -80.00
 *						**** %d: ����, %f: �Ǽ�, %c: ����, %s: ���ڿ�
 *
 */
public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.printf("%.1f",80.55);
		
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a+b);
		System.out.printf("%d*%d=%d",a,b,a*b);  //JDK 1.5���ͻ�밡��
	}

}
