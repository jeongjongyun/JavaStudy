import java.util.Scanner;

public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%d*%d=%d\n",2,2,4);  
		// \n =>newLine => 새로운줄에 출력
		// \t => tap  =>일정간격
		/*
		 * System.out.printf("%d*%d=%d",2,3,6);
		 */
		
		Scanner scan=new Scanner(System.in);
		/*
		 * Scanner: 데이터형
		 * Scan : 변수
		 * new : 메모리에 저장
		 * Scanner(System.in) : 초기화
		 */

		System.out.print("1' 정수 입력:");
		int a= scan.nextInt();  // 입력된 정수를 읽어와서 a라는 메모리에 저장
		//System.out.print("2' 정수 입력:");
		int b= scan.nextInt();
		
		//출력
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		// Scanner => 도스에서만 사용
		
	}

}
