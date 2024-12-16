package day01;

public class SystemOut {
	public static void main(String[] args) {
		//main ctrl+space 자동생성됨
		//맨뒤에 ln이 들어가면 맨 마지막출력에 개행이 포함됨
		
		System.out.println("손씻고싶다");
		System.out.println("집가고싶다");
		System.out.println("집가서 정처기 공부할거임");
		
		System.out.print("직접 개행이 필요한 메서드\n");
		System.out.printf("%d + %d = %d", 1,2,3);
		System.out.println();
		System.out.println();
		
		
		//형식지정 출력문
		//서식문자를 쓰게 됨
		/*
		 
		  \n 줄바꿈
		  \t tap 버튼만큼 8칸 띄어쓰기 됨
		  %d 정수를 입력받음
		  %s 문자열을 입력받음
		  %f 실수값을 입력받음
		  
		   */
		
		System.out.printf("얼른 %s 가고 싶다. %d시까지 갈거야", "발레",7);
		System.out.println("개행했니?");
		System.out.println();
		
	}

}
