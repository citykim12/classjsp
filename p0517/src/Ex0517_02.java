import java.util.Scanner;

public class Ex0517_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.>>");
		String search = scan.next();

		String[] boardTitle = {"������ ��ϵǾ����ϴ�.", "Ȩ������ ����", 
				"���ϼ����ϳ���?", "�ѱ����������б� �Ұ�", "�츮���� ����л��� �ֳ���?",
				"�������� ������ �ϳ���?", "�ѱ����������б� ��ġ�� ��� �ǳ���?",
				"����Ʈ ����� ���", "�ѱ����������б� ����Ʈ�� �ֳ���?"
		};
		
		// �˻��ؼ� �˻����� ���Ե� �͸� ����� �غ�����.
		// ����Ʈ, �ѱ����������б�, ����
		
		for(int i=0; i<boardTitle.length; i++) {
			if(boardTitle[i].contains(search)) {
				System.out.println(boardTitle[i] + " �˻��� ���ڰ� �ֽ��ϴ�.");
			}else {
				System.out.println("�˻��� ���ڰ� �����ϴ�.");
			}
		}
		
//		String[] str = {"ȫ�浿", "ȫ����", "ȫ���", "�浿��", "�̼���", "������", "�̹���"};
//		for(int i=0; i<str.length; i++) {
//			if(str[i].contains(search)) {
//				System.out.println(str[i] + " �˻��� ���ڰ� �ֽ��ϴ�.");
//			}else {
//				System.out.println("�˻��� ���ڰ� �����ϴ�.");
//			}
//		}

	} //main

} //class