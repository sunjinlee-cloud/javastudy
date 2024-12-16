package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		
		//문제 1 - 다음 연산에 대한 결과를 유추해 보세요. 
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2); //5
		System.out.println( !('A' <= c && c <='Z') ); //false 
		System.out.println('C'-c); //2
		System.out.println(c+1);//66
		System.out.println(++c);//66<-이 아니라 B. 왜냐면 이항연산자가 아니라서 자리수를 맞출 필요가 없다. 타입캐스팅 안됨
		System.out.println(c++);//66<-이 아니라 B. 얘도 타입캐스팅 안됨
		System.out.println(c);//67<-이 아니라 C. 이건 실수

		
		System.out.println("-------------------------------------");
		//문제 2 - 랜덤한 두 주사위의 합을 구하는 문제입니다.
		//1~6까지 주사위를 2개 만들어서 두 주사위의 합을 구해주세요. 
		//"두 주사위의 합은: x" 형식으로 출력해주세요.
		
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		int xx = a + b;
		System.out.println("두 주사위의 합은 : "+xx);
		
	}
}
