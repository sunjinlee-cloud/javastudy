package day02;

public class OperatiorEx01 {
	
	public static void main(String[] args) {
		
		//단항연산자
		int i = -3;
		int j = +3;
		int k = -i;//3
		
		//증감연산자
		int x = 1;
		int y= x++;//후위연산자의 경우 먼저 값을 대입하고 나서 다음에 증가함.
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
		System.out.println("-------------------------------------------------");
		
		int n = 1;
		int m = ++n;
		System.out.println("n값: "+n);
		System.out.println("m값: "+m);
		System.out.println("-------------------------------------------------");
		
		//비트 반전 연산자 ~  : 비트 값을 반대로 바꿈
		byte b = 10;//0000 1010
		System.out.println(~b); //1111 0101로 바뀐 값을 십진수로 변환해 출력
		//컴퓨터가 빼기연산할때 보수값(더하면 0되는 수)을 찾아서 연산
		System.out.println("-------------------------------------------------");
		
		//논리 반전 연산자
		boolean bool = !true;
		System.out.println(bool);
			
	}

}
