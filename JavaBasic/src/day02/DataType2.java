package day02;

public class DataType2 {
	
	public static void main(String[] args) {
		
		//char 타입 : 단일문자를 저장
		char ch = 'A';
		char ch1 = 65;//아스키코드 : 문자들이 숫자값을 가진다. A의 값은 65
		char ch2 = 45000;//char 형을 2byte 크기로 확장시키고 전세계 문자열을 아스키코드에 포함시킴 => 유니코드의 탄생
		char ch3 = '\uAC00'; //<-- 역슬래시+u를 붙여주면 유니코드를 쓰겠다는 선언(뒤에는 16진수임)
		
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println(ch + ch1 + ch3); //이러면 숫자계산으로 들어감
		System.out.println("ch" + "ch1" + "ch3");//이러면 쌍따옴표 안에 든 문자가 그대로 출력
		System.out.println(ch + " " + ch3);//이래야 char 대로 나옴
		
		String str = "hello";
		String str2 =" world";
		String str3 ="배고팓";
		String str4 = " 공백도    문자임   .";
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str4.length());//String의 길이를 반환하는 메서드
		
		//문자열과 다른 데이터 타입을 + 연산하면?
		System.out.println(100 + 200);
		System.out.println("100" + 200);
		
		System.out.println("A" + 10); // char형을 ""안에 넣으면 문자로 출력
		System.out.println('A' + 10); //char형과 숫자를 +로 연결시 숫자로 출력
		
	}

}
