package test_main;

public class MainClass04 {
	public static void main(String[] args) {
		MainClass04.showSum(2, 4); 
		//같은 class 안에 있는것은 class명 생략 가능
		showSum(10, 20);
	}
	
	public static void showSum(int num, int num2) {
		int sum = num+num2;
		System.out.println("전달받은 두 수의 합은 "+sum+" 입니다.");
	}
	/*
	 * 메소드 명 : showSum
	 * 전달받는 인자의 갯수 : 2개
	 * 전달받는 인자의 데이터 type : 2개 모두 int type
	 * 메소드 내에서의 동작 : 전달 받은 2개 정수의 합을 출력
	 */
}
