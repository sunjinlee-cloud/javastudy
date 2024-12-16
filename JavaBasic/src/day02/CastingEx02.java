package day02;

public class CastingEx02 {

	public static void main(String[] args) {
		
		int i = 70;
		char c = (char) i; //int -> char로 컴파일러가 자동으로 못 바꿈. 타입캐스팅 해줘야
		short s = (short)i;//타입캐스팅
		System.out.println(c + " " + s);
		
		float f1 = 3.14F;
		int j = (int) f1;
		System.out.println(j); //실수를 정수에 넣었으므로 소수점 아래 부분은 잘려 나가고 정수만 출력됨

		int a = 1000;
		byte b = (byte)a;
		System.out.println(b);
		//1000을 이진수로 만든다음에 byte가 인식가능한 8자리까지만 취해서 다시 10진수로 바꿨기 때문에 -24가 나온다.
		
		
	}
}
