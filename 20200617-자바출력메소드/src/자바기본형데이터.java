/*
 * 	�ڹ� => �⺻��
 * 		 �ڹٿ� �����ϴ� ��������
 * 		 ����==> boolean => �� : true/false : if(���ǹ�)�� ����ҋ� �ַ� ����ϴ� ��������
 */
// =========> upcasting (�ڵ�����ȯ)
//	byte < short(char)< int < long < float < double
//		<=========== downcasting (��������ȯ)
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
public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����
		boolean b= false; // �׻� �ҹ��ڷ� ==> 1byte
		System.out.println("b="+b);
		b= true;
		System.out.println("b="+b);

		
		System.out.println('ȫ');
		System.out.println((int)'ȫ');
		// �����ڴ� ���ڹ�ȣ�� ������ �ִ� (char�� ���������� �ν��Ѵ�)
	}

}
