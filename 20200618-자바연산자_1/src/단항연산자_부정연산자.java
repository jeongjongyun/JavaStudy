/*
 * 부정연산자 : !
 * 	=> true=>false, false=>true
 * 	=> 결과값 : boolean
 * 		단항 : 증감 => int
 * 			  부정 => boolean
 * 		
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean bCheck= true;
		bCheck=!bCheck;  // true의 반대값을 저장한다
		bCheck=!bCheck;
		bCheck=!bCheck;
		System.out.println("bCheck= "+bCheck);
	}

}
