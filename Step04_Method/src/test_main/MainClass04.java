package test_main;

public class MainClass04 {
	public static void main(String[] args) {
		MainClass04.showSum(2, 4); 
		//���� class �ȿ� �ִ°��� class�� ���� ����
		showSum(10, 20);
	}
	
	public static void showSum(int num, int num2) {
		int sum = num+num2;
		System.out.println("���޹��� �� ���� ���� "+sum+" �Դϴ�.");
	}
	/*
	 * �޼ҵ� �� : showSum
	 * ���޹޴� ������ ���� : 2��
	 * ���޹޴� ������ ������ type : 2�� ��� int type
	 * �޼ҵ� �������� ���� : ���� ���� 2�� ������ ���� ���
	 */
}
