import java.util.Scanner;

public class Ex0511_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �� ���ڸ� �Է¹޾�
		// ��Ģ����(+, -, *, /)�� �����ϸ� ���� ����Ͻÿ�.
		// �Ҽ��� ��� ����

//		teachers answer
		System.out.println("1��° ���ڸ� �Է��ϼ���.>>");
		double num1 = scan.nextDouble();
		System.out.println("2��° ���ڸ� �Է��ϼ���.>>");
		double num2 = scan.nextDouble();
		System.out.println("��Ģ���� �Է��ϼ���.(+, -, *, /)>>");
		char input = scan.next().charAt(0);
		
		double result = 0; // ����� �ʱ�ȭ
		String str = ""; // ��Ģ���� ���� �ʱ�ȭ
		switch(input) {
		case '+':
			str="���ϱ�";
			result = num1 + num2;
			break;
		case '-':
			str="����";
			result = num1 - num2;
			break;
		case '*':
			str="���ϱ�";
			result = num1 * num2;
			break;
		case '/':
			str="������";
			result = num1 / num2;
			break;
		}
		System.out.println("�Է°� : " + num1 + "," + num2);
		System.out.println("��Ģ���� : " + str);
		System.out.println("����� : " + result);
		
//		���� ��
//		int a, b;
//		String cal;
//		
//		System.out.println("ù��° �� = ");
//		a = scan.nextInt();
//		
//		System.out.println("�����ȣ�Է� = ");
//		cal = scan.next();
//		
//		System.out.println("�ι�° �� = ");
//		b = scan.nextInt();
//		
//		switch(cal) {
//		case "+":
//			System.out.println();
//		}
		
		// ����, ���, ��õ �� �������Դϴ�.
		// �λ�, �뱸, ���� �� ��󵵱��Դϴ�.
		// ����, ����, ���� �� ���󵵱��Դϴ�.
		// ����, ����, û�� �� ��û�����Դϴ�.
		// ��õ, ����, ���� �� ���������Դϴ�.
		
//		System.out.println("���ø� �Է��ϼ���.>>");
//		String input = scan.next();
//		
//		switch(input) {
//		case "����":	case "���":	case "��õ":
//			System.out.println("�������Դϴ�.");
//			break;
//		case "�λ�":
//		case "�뱸":
//		case "����":
//			System.out.println("��󵵱��Դϴ�.");
//			break;
//		case "����":
//		case "����":
//		case "����":
//			System.out.println("���󵵱��Դϴ�.");
//			break;
//		case "����":
//		case "����":
//		case "û��":
//			System.out.println("��û�����Դϴ�.");
//			break;
//		case "��õ":
//		case "����":
//		case "����":
//			System.out.println("���������Դϴ�.");
//			break;
//
//		default:
//			break;
//		}
		
//		System.out.println("������ �Է��ϼ���.>>");
//		int score = scan.nextInt();
//		String grade="";
//		if(score >= 90) {
//			grade="A";
//			if(score >= 98) {
//				grade = grade + "+"; // ���þ�� �̰Ͱ� ����: grade += "+";
//			}else if(score <= 93) {
//				grade = grade + "-";
//			}
////			System.out.println("A");
//		}else if(score >= 80) {
//			grade="B";
//			if(score >= 88) {
//				grade = grade + "+"; // ���þ�� �̰Ͱ� ����: grade += "+";
//			}else if(score <= 83) {
//				grade = grade + "-";
//			}
////			System.out.println("B");
//		}else if(score >= 70) {
//			grade="C";
//			if(score >= 78) {
//				grade = grade + "+"; // ���þ�� �̰Ͱ� ����: grade += "+";
//			}else if(score <= 73) {
//				grade = grade + "-";
//			}
////			System.out.println("C");
//		}else if(score >= 60) {
//			grade="D";
//			if(score >= 68) {
//				grade = grade + "+"; // ���þ�� �̰Ͱ� ����: grade += "+";
//			}else if(score <= 63) {
//				grade = grade + "-";
//			}
////			System.out.println("D");
//		}else {
//			grade="F";
//			System.out.println("F");
//		}
	}
}