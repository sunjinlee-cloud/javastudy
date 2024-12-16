package day02;

public class CastingEx01 {
	public static void main(String[] args) {
		
		
		//작은 타입을 큰 타입으로 변환시 JVM이 자동형변환 해줌
		byte a= 10;
		short s = a; //더 큰 쪽(short)으로 자동형변환
		int i = a;
		long l = a;
		
		
		char c = '가';
		int j = c; //char < int 이므로 char가 아스키코드를 따라서 int로 자동 변환됨
		System.out.println("가의 유니코드 값 : "+j);
		System.out.println(c);
		System.out.println();System.out.println();
		
		int k = 1000;
		double d = k; //자동형변환
		System.out.println(d);//소수점이 나온 것을 보고 double로 바뀐 것을 알 수 있음
		
		
	}

}
