package day02;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		a += 3; //a = a +3
		b =+ 3; //잘못쓴거임. 컴파일러는 b = +3; 으로 인식함
		
		System.out.println(a + " " + b);
		
		a -= 4;
		a *= 10;
		a /= 5;
		a %= 2;
		System.out.println(a);
	}
}
