package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//�л��������� ��ü�迭
		ArrayList list = new ArrayList();
		Stu_process p = new Stu_process(); 
		
		loop1: while(true) {
			System.out.println("[ �л����� ���α׷� ]");
			System.out.println("1. �л����� �߰�");
			System.out.println("2. �л����� ���");
			System.out.println("3. �л����� ����");
			System.out.println("4. �л����� �˻�");
			System.out.println("5. �л� ���ó��");
			System.out.println("0. ���α׷� ����");
			System.out.println("--------------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� �� ");
			
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: //�л������߰�
				//1.�̸�,����,����,����
				p.student_insert(list);
				break;
			case 2://1. ������
				//2. for���� ����ؼ� 3.list�� �ִ� ������ ���
				// ��ȣ	�̸�	����	����	����	�հ�	���	���
				p.student_print(list);
				break;
			case 3://�л���������
				//1. ������ �л��˻�-�� 2.������ 3.�����Է� 4.���� ����
				p.student_update(list);
				break;
			case 4://�л������˻�
				//1. �˻��� �̸��Է� 2.for�ݺ� 3.if�� 4.���
				p.student_search(list);
				break;
			case 5://���ó��
				//1. �հ� ��ü ������ 2. �հ� ��ü �� 3.���ó��
				p.student_rank(list);
				break;
			case 0://���ó��
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}//switch
		} //while1

	} //main

} //class
