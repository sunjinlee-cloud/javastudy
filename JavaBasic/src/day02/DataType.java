package day02;

public class DataType {
	
	public static void main(String[] args) {
		
		byte a = 127; 
		byte a1 = -128;
		
		short b = 32767, b1 = -32768;
		
		int c = 2147483647; //대충 21억
		int c1 = -2147483648;
		
		long d = 934857983722349827L; //long 타입은 저장시 뒤에 L을 붙여주기
		
		/*2진수, 8진수, 16진수 형태로도 저장가능
		 2진수 - 앞에 0b를 붙임
		 8진수 - 앞에 0을 붙임
		 16진수 - 앞에 0x를 붙임
		*/

		int bin = 0b1010;
		System.out.println("이진수 bin의 십진수 값은 : "+bin+" 입니다.");
		System.out.println("------------------------------------------------------");
		
		//실수 자료형
		float f1 = 3.1423455f;//뒤에 F를 붙여준다.
		double d1 = 3.14;//기본형
		
		float f2 = 3.14159265358F;
		double d2 = 3.14159265358;
		
		System.out.println(f2);//float은 더 저장하더라도 소수점 아래 7자리까지만 신뢰성 있는 값으로 표현가능
		System.out.println(d2);
		
		System.out.println("------------------------------------------------------");
		
		boolean bool = true; //boolean 타입에는 true, false만 저장 가능하다.
		boolean bool1 = false; 
		
		System.out.println(bool);
		System.out.println(bool1);
		
		System.out.println("------------------------------------------------------");
		
		
		
		
		
		
		
	}

}
