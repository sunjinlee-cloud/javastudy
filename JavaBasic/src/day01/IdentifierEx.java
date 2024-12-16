package day01;

public class IdentifierEx {

	public static void main(String[] args) {
		
		//식별자-이름 규칙
		//1. 대소문자를 구분
		//2. 클래스 이름의 첫 글자와 연결된 단어의 첫 글자는 대문자로 표기
		//3. 변수 이름의 첫 글자는 소문자로, 연결된 단어의 첫 글자는 대문자로 표기
		int age = 17;
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
//		int 4num = 1;  변수 이름은 숫자로 시작할 수 없다.
		int phonenumber = 4;
		int phoneNumber = 10; //로우 캐멀백 기법으로 표기하기
		
		//키워드는 사용할 수 없다.
//		int int = 1;
//		int class = 1;
	}
}
