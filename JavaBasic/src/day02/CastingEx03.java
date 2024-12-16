package day02;

public class CastingEx03 {

	public static void main(String[] args) {
		
		//연산이 일어날 때 형변환 : 
		//1. 서로 크기가 다른 타입끼리 연산하면 작은 타입이 큰 타입에 맞춰 형변환됨
		//2. int형 보다 작은 타입의 연산 결과는 무조건 int 가 된다. 왜냐면 컴퓨터의 연산방식 자체가 32bit기준이기 때문
		
		char c = 'C';
		int i = 2;
		
		char cc = (char) (i + c);
		System.out.println(cc);
		
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2) ; // int형보다 작은 타입끼리 연산하면 int가 되어버린다. 이 때도 타입캐스팅 해준다.
		
		short s1 =100;
		byte b4 =10;
		short s2 = (short)(s1 + b4);
		
		System.out.println('A'+10+" ");//75가 나온다. char + int이므로 char가 int로 바뀌어 연산되기 때문.
	}
}
