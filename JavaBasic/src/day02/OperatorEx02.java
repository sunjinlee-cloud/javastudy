package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//이항연산자 
		int i = 7 / 3; //int끼리 연산했으므로 int가 나옴
		int j = 7 % 3;
		int k = 7*3;
		System.out.println("7 나누기 3의 몫: "+i);
		System.out.println("7 나누기 3의 나머지: "+j);
		System.out.println("7 곱하기 3: "+k);
		System.out.println();
		
		//비교연산자
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i >= j);
		System.out.println(i < j);
		System.out.println(k%2==0);
		System.out.println(k%2!=0);
		
		System.out.println("----------------------------------------------------------------");
		
		//비트 연산자 &, | ^
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		System.out.println(a & b); //0000 0001
		System.out.println(a | b); //0000 0111
		System.out.println(a ^ b); //0000 0110 : 두 비트가 다르면 1, 같으면 0
		
		//비트 이동 연산자 >>, <<
		int h = 100;
		System.out.println(h >> 2);//이진수의 자리를 오른쪽으로 2칸 이동한다.
		
		
		
		
	}
	
}
