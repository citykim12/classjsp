package pack01;

import java.util.Scanner;

public class Process01 {
	static Scanner scan = new Scanner(System.in); //Ŭ���� ����
	
	//numInput �޼ҵ�
	int[] numInput(){
		int[] num = new int[2]; //num1, num2��� �迭
		
		for(int i=0; i<num.length; i++) {
			System.out.println((i+1) + "��° ���� �Է��ϼ��� �� ");
			num[i] = scan.nextInt();
		}
		return num;
	}
	//���ϱ� �޼ҵ�
	int add(int num1, int num2) { //�ν��Ͻ� �޼ҵ�
		int result = num1+num2;
		return result;
		
	}
	
	// �μ����� ���ϱ� �޼ҵ�
	int numBetween(int num1, int num2) {
		int sum = 0; //�հ� ����
		for(int i=num1; i<=num2; i++) { //5,10
			sum = sum + i;
		}
		return sum;
	}
	
	String numCompare(int num1, int num2) {
		//teacher answer
		String str = "";
		if(num1<num2) {
			str = "ū ��: " + num2+ ", " + "���� ��: " + num1;
		}else if(num1>num2) {
			str = "ū ��: " + num1 + ", " + "���� ��: " + num2;
		}else{
			str = "�μ� ũ�Ⱑ ����: " + num1;
		}
		return str;
//		
		//me answer
//		int result1 = 0;
//		if(num1<num2) {
//			System.out.println("ū ��: " + num2+ ", " + "���� ��: " + num1);
//		}else if(num1>num2) {
//			System.out.println("ū ��: " + num1 + ", " + "���� ��: " + num2);
//		}else{
//			System.out.println(num1 + "," + num2 + "�μ��� �����ϴ�.");
//		}
//		return result1;
	}
	
}
