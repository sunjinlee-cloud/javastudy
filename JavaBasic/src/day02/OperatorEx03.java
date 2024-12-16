package day02;

public class OperatorEx03 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		//if문의 소괄호 내용이 true라면 구문을 실행한다. false라면 else구문을 실행한다.
		if (x !=10 && ++y == 21) {// 빠른연산자는 절대 만족할 수 없는 조건일때 두 번째 조건을 실행하지 않는다.
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
		
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
		System.out.println();
		
		//
		if (x==10 || ++y ==21) {
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
		System.out.println();
		
	}

}
