package day01;

public class VariableScope {
	

	public static void main(String[] args) {
		
//		변수의 범위 - 중괄호 안에서만 유효하다.
		int num1 = 10;
		int num2 = 20;
		int num3 = 30, num4 = 40; //같은 타입 변수면 , 로 나열해 초기화 가능하다.
		
		if(true) {
			int num5 = 100;
			num1 = 10 + num2 ;
		
			int result = num1 + num2 ; // result는 if문 밖에서 선언되지 않았으므로 밖에서는 사용 불가
		}
		
		int num5 = 20;
		System.out.println(num5); //변수는 자신이 선언된 중괄호 안에서만 유효하다.
		System.out.println(num1); //중괄호 바깥에서 선언된 변수는 안에서도 사용 가능하다.
		System.out.println("연어먹고싶다");
	}

}
