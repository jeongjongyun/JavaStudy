/*
 * 	'A'+'B'
 * 	***������ ���� �ʰ��ϸ� error�� �ƴ϶� �����÷ο��� �߻�
 * 		ex) int ==> ���� 1~ 10   ==> 11 ==> 1
 */
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// % ==> double +int +char ==>double
		int a=5;
		int b=2;
		
		System.out.println(a%b); // 5%2 ==>1
		System.out.println(-a%b); // -5%2 ==>-1
		System.out.println(a%-b); // 5%-2 ==>1
		System.out.println(-a%-b); //-5%-2% ==>-1
	}

}
