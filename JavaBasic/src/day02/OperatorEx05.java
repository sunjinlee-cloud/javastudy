package day02;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		//프로그램에서 난수값이 필요할 때가 있다.
		System.out.println(Math.random()); //0.0이상 1.0 미만의 double형 랜덤값 출력
		
		//1~10사이의 랜덤값을 출력하려면
		double d = Math.random()*10; //0.0~10.0
		int r = (int) d + 1; 
		System.out.println(r);
		
		int ran = (int)(Math.random() * 10) +1;
		System.out.println(ran);
		
		//삼항연산자
		//1~100사이 랜덤값을 출력하려면
		int x = (int)(Math.random()*100) + 1;
		System.out.println(x);
		
		String result = x % 2 == 0 ? "짝수" : "홀수"; 
		System.out.println("랜덤수 : " + x +" 은/는 "+ result +" 입니다.");
		
	}
}
