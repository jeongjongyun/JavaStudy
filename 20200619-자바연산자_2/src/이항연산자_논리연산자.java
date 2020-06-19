/*
 * 논리연산자  ==> if문에 주로 사용
 * 	형식 => &&(직렬연산자), ||(병렬연산자)
 * 		  ==========   ==========
 * 		    두개 true  		한개이상 true
 * 		&&=> 범위, 기간을 포함
 * 		||=> 범위, 기간을 벗어나는 경우에 주로 사용
 * 	
 * 		jumsu >=90 (&&) jumsu <=100
 * 
 * 		jumsu <=0 || jumsu>100
 * 
 * 		조건 (&&,||) 조건
 * 	    ===		   ===
 * 		true/false  true/false
 * 
 * 							&&		||
 * 		=====================================
 * 		true true		  true  	true
 * 		=====================================
 * 		true flase		  false		true
 * 		=====================================
 * 		false true		  false		true
 * 		=====================================
 * 		false flase		  false		false
 * 
 * 		효율적인연산
 * 		int a=10;
 * 		int b=9;
 * 
 * 		a<b && ++b==a ==> false
 * 		===		======
 * 				연산 수행 여부
 * 		&&=> 왼쪽에 있는 조건이 false면 오른쪽 연산 수행하지 않음
 * 		||=> 왼쪽에 있는 조건이 true면 오른쪽 연산 수행하지 않음
 */


public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char c1='A';
		int i=65;
		char c2='B';
		
		
	}

}
