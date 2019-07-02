/*
 * ����
 * 	1. ex04�� �ּ� ����
 * 	2. ���� �� ���� �޼ҵ�, �� �� Ŭ�������� �ɹ� ������ �������� ����
 * 		- �ɹ� ������ ���ٴ� ���� ��ü ���� �ǹ̰� ����
 * 		- ���� ��� �޼ҵ�� static���� ��ü �������̵� ȣ�� ������ �������� ����
 * 	3. ���� & ȣ��
 * 		static ��ȯ Ÿ�� �޼ҵ�([..]){[..]}
 * 		ȣ��
 * 			1. ������ Ŭ������ �޼ҵ� 
 * 				�޼ҵ��();
 * 				Ŭ������.�޼ҵ��();
 * 			2. �ܺ� Ŭ������ �޼ҵ�
 * 				Ŭ������.�޼ҵ��();
 * 4. ���ǽ� ���� �н�
 * 	- test ������(����) ����
 * 		1. Ÿ�� Ȱ��
 * 			1. �⺻ Ÿ��
 * 			2. ���� Ÿ��(��ü Ÿ��, object, reference)
 * 				- String Ÿ��
 * 				- java.lang�� �����ϰ� import���� �ʰ� ��� ����
 * 				- �� �񱳽� String Ŭ���� ���� equals()�޼ҵ� ����
 * 					public boolean equals(String data){
 * 						�� �޼ҵ尡 �����ϰ� �ִ� String ��ü�� ���밪�� parameter�� ��
 * 						-> �����ϸ� true
 * 						-> �ٸ� ��� false
 * 					}
 * 		2. �� ����
 * 			���� ��? ��Һ�?
 */
package step01;

public class Ex05If {
		//parameter�� ���ԵǴ� �����ͷ� �޼ҵ� ���ο� ����� ���� �������� ���ؼ� boolean ��ȯ
		//�����ǰ� admin/admin2 
		
	static boolean idcheck(String id) {
			String admin ="admin";
			if(admin.equals(id))
				{return true;
			}else {
				return false;
		} 
	
		//�����ǰ� admin/admin2 
	static boolean idcheck2(String id) {
			String admin ="admin";
			if(admin.equals(id))
				{return true; //���⼭ true�� �� �������� ���� -> false�϶� ���� ���� 
			}else if("admin2".equals(id)) {
				return true;
			}else {
				return false;
			}
		}
	public static void main(String[] args) {
		System.out.println(idcheck("m")); //false
		System.out.println(idcheck2("admin")); //true
		
	}
	/*step1
	 * 	String data ="encore";
		String data2 = "encore";
		boolean r = data.equals(data2);
		System.out.println(r); */
		
		//step2 
		String data = "encore";
		String data2 = "encore";
		System.out.println(data.equals(data2));
		
		//step3
		System.out.println("encore".equals("encore"));
	}
}

/* 1->2->3 
���� �����Ǿ�� ���� (���������� 3���� �Ǿ�� ��) */