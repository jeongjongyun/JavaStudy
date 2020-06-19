/*
 * 	'A'+'B'
 * 	***데이터 형을 초과하면 error가 아니라 오버플로워를 발생
 * 		ex) int ==> 범위 1~ 10   ==> 11 ==> 1
 */
public class 이항연산자_산술연산자2 {

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
