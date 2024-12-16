package day01;

public class VariableEx {
	public static void main(String[] args) {
		
		/*
		변수의 선언방법 : 타입 이름;
		
		int : 정수를 저장하는 자료형
		
		*/
		int num;
		num = 10;
		
		System.out.println(num);
		
//		변수의 선언과 초기화를 동시에 할 수 있음
		int num2 = 20;
		
//		같은 이름으로 변수를 선언할 수 없다
//		int num = 30;
		
//		변수에 새로운 값을 대입, 연산한 결과를 저장하는 것은 가능
		num = 30;
		num = 200;
		num = 200 + 300 + num2;
		
		System.out.println(num);
		
//		String : 문자열을 저장하는 자료형. 문자열을 ""안에 넣어줘야 함
		String str = "안녕ㅎ";
		
		System.out.println("---------------------------------------------");
		
		int result = num + num2 ;
		result = 100;
		result = num;
		result = result + 1; 
		System.out.println(result);
		
	}
}
