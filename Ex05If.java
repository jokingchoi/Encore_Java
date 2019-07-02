/*
 * 구조
 * 	1. ex04의 주석 참조
 * 	2. 로직 별 개별 메소드, 단 이 클래스에는 맴버 변수는 존재하지 않음
 * 		- 맴버 변수가 없다는 것은 객체 생성 의미가 없음
 * 		- 따라서 모든 메소드는 static으로 객체 생성없이도 호출 가능한 문법으로 개발
 * 	3. 구현 & 호출
 * 		static 반환 타입 메소드([..]){[..]}
 * 		호출
 * 			1. 동일한 클래스의 메소드 
 * 				메소드명();
 * 				클래스명.메소드명();
 * 			2. 외부 클래스의 메소드
 * 				클래스명.메소드명();
 * 4. 조건식 문법 학습
 * 	- test 데이터(변수) 구성
 * 		1. 타입 활용
 * 			1. 기본 타입
 * 			2. 참조 타입(객체 타입, object, reference)
 * 				- String 타입
 * 				- java.lang만 유일하게 import하지 않고 사용 가능
 * 				- 값 비교시 String 클래스 내에 equals()메소드 존재
 * 					public boolean equals(String data){
 * 						이 메소드가 보유하고 있는 String 객체의 내용값과 parameter값 비교
 * 						-> 동일하면 true
 * 						-> 다른 경우 false
 * 					}
 * 		2. 비교 조건
 * 			동등 비교? 대소비교?
 */
package step01;

public class Ex05If {
		//parameter로 유입되는 데이터로 메소드 내부에 선언된 로컬 변수값과 비교해서 boolean 반환
		//비교조건값 admin/admin2 
		
	static boolean idcheck(String id) {
			String admin ="admin";
			if(admin.equals(id))
				{return true;
			}else {
				return false;
		} 
	
		//비교조건값 admin/admin2 
	static boolean idcheck2(String id) {
			String admin ="admin";
			if(admin.equals(id))
				{return true; //여기서 true면 더 검증하지 않음 -> false일때 다음 진행 
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
점차 정제되어가는 과정 (최종적으로 3번이 되어야 함) */