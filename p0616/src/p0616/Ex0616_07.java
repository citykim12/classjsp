package p0616;

import java.util.Random;
import java.util.Scanner;

public class Ex0616_07 {

	public static void main(String[] args) {
		//���� 1��12345 �� 0-9���� ���� 
		// ������ �ڸ� �� 1õ��
		// ������ 2�ڸ� �� 1����
		// ������ 3�ڸ� �� 10����
		// ������ 4�ڸ� �� 100����
		// ������ 5�ڸ� �� 1000����
		// 1��°�� �������� ���ڸ� �����ؼ� 1��12345 ���ǹ�ȣ�� �����غ�����.
		
		//�����͸� �Է¹޾� ���ڰ� � �´����� ����Ͻÿ�.
		// 1��95494 �� 3��96694 �� � �´���
		// ���� �Է��� ������ : 1��95494
		// ��÷�� ���� ������ : 3��96694
		// 3���� ��÷�Ǿ����ϴ�.
		
		//��÷��ȣ int �迭
		int[] inputNum = new int[6];
		//ǥ�� �迭
		char[] ch = new char[6];
		
		//���ǹ�ȣ�Է�
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ��ȣ�� �Է��ϼ��� �� (ex: 1��12345)");
		String input = scan.next();	//1��01234
		//int �迭�� ���
		for(int i=0;i<inputNum.length;i++) {
			if(i==0) {
				inputNum[i] = input.charAt(i)-'0';	//1| |01234
			}else if(i==1) continue;
			else {	//2,3,4,5,6
				inputNum[i-1] = input.charAt(i)-'0';	//101234
			}
		}
		
		//���� ��÷��ȣ ����
		int[] num = new int[6];
		for(int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*10);
		}
		
		//��÷���� Ȯ��
		int count = 0;
		for(int i=0;i<num.length;i++) {
			if(inputNum[i]==num[i]) {
				ch[i]='O';
				count++;
			}else {
				ch[i] = 'X';
			}
		}
		
		//�Է¹�ȣ ���
		System.out.println(inputNum[0]+"��"+inputNum[1]+inputNum[2]+inputNum[3]+inputNum[4]+inputNum[5]);
		
		//���� ��÷��ȣ ���
		System.out.println(num[0]+"��"+num[1]+num[2]+num[3]+num[4]+num[5]);
		System.out.println("---------------------------");
		System.out.println(ch[0]+"��"+ch[1]+ch[2]+ch[3]+ch[4]+ch[5]);
		System.out.println("��÷ ����: " + count);
		
		//me answer
//				if(inputNum[0]==num[0]) {
//					System.out.println("O");
//				}else {
//					System.out.println("X");
//				}
		
		//me answer
//		String[] mynum = new String[6];
//		int[] result = new int[6];
//		
//		while(true) {
//			for(int j=0;j<mynum.length;j++) {
//				System.out.println("to input 6 numbers �� ");
//				mynum[j] = scan.nextLine();
//				System.out.println(mynum[j]);
//			}
//			
//			
//			if(num.equals(mynum)) {
//				System.out.println("��� ������ϴ�! 1�� ��÷!");
//			}
//		}
//		
//		
		
//		for(int i=0;i<num.length;i++) {
//			num[i] = (int)(Math.random()*10);
//			for(int j=0;j<i;j++) {
//				if(num[i] == num[j]) {
//					System.out.println("same data");
//				}
//				System.out.println("���ڸ� �Է��ϼ��� �� ");
//				count = scan.nextInt();
//				count++;
//			}
//		}
		
//		while(true) {
//			System.out.println("to input 6 numbers");
//			int myNo = scan.nextInt();
//		}
		
//		int num1 = (int)(Math.random()*10);
//		int num2 = (int)(Math.random()*10);
//		int num3 = (int)(Math.random()*10);
//		int num4 = (int)(Math.random()*10);
//		int num5 = (int)(Math.random()*10);
//		int num6 = (int)(Math.random()*10);
//		
//		int num2 = (int)(Math.random()*100000);
//		System.out.println(num1+"��"+num2+num3+num4+num5+num6);
		
		
		//me answer
//		int lotto[] = new int[5];
//		
//		int count = 0;
//		for(int j=0;j<9;j++) {
//			count = (int)(Math.random()*9);
//			count++;
//			for(int i=0;i<200;i++) {
//				lotto[i] = (int)(Math.random()*1000);
//				System.out.println(count + "��" + lotto[i]);
//				lotto[i]++;
//			}
//		}
		
		//���۸� �ζ����α׷�
//        System.out.println(">> �ζ� ���α׷�  ");
//        while (true) {
// 
//            System.out.println("���� 6���� �Է��� �ּ���");
//            int arr[] = new int[6];
//            Scanner sc = new Scanner(System.in);
// 
//            for (int i = 0; i < 6; i++) {
//                arr[i] = sc.nextInt();
//                if (arr[i] > 0 && arr[i] <= 65) {
//                } else {
//                    System.out.println("������ �Ѿ����ϴ�.");
//                    i--;
//                }
//                for (int j = 0; j < i; j++) {
//                    if (arr[i] == arr[j]) { // �ߺ� Ȯ��
//                        System.out.println("�ߺ��Դϴ�.");
//                        i--;
//                    }
//                    if (arr[i] < arr[j]) { // ���� ���� ����
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//            System.out.print("����� �Է��� ���ڴ� : ");
//            for (int i = 0; i < 6; i++) {
//                System.out.print(arr[i] + " ");
//            }
// 
//            // ��ǻ�� ���� ����
//            Random ram = new Random();
//            int comarr[] = new int[6];
//            for (int i = 0; i < 6; i++) {
//                comarr[i] = ram.nextInt(65) + 1;
//                for (int j = 0; j < i; j++) {
//                    if (comarr[i] == comarr[j]) {
//                        i--; // �ߺ� �Ͻ� ���� ����
//                    }
//                }
//                for (int j = 0; j < 6; j++) {
//                    if (comarr[i] < comarr[j]) {
//                        int temp = comarr[i];
//                        comarr[i] = comarr[j];
//                        comarr[j] = temp;
//                    }
//                }
//            }
//            System.out.print("�ζ� ��÷ ��ȣ�� : ");
//            for (int i = 0; i < 6; i++) {
//                System.out.print(comarr[i] + " ");
//            }
// 
//            // ����ڰ� �Է��� ���ڿ� ��ǻ���� ���� ��
//
//            System.out.println("\n\n\n\n");
//            int cont = 0;
//            for (int i = 0; i < 6; i++) {
//                for (int j = 0; j < 6; j++) {
//                    if (arr[i] == comarr[j]) {
//                        cont++;
//                    }
//                }
//            }
//            if (cont == 0) {
//                System.out.println("�õ� !!!");
//            } else if (cont == 1) {
//                System.out.println("6�� !!!");
//            } else if (cont == 2) {
//                System.out.println("5�� !!!");
//            } else if (cont == 3) {
//                System.out.println("4�� !!!");
//            } else if (cont == 4) {
//                System.out.println("3�� !!!");
//            } else if (cont == 5) {
//                System.out.println("2�� !!!");
//            } else if (cont == 6) {
//                System.out.println("1�� !!!");
//            } else {
//                System.err.println("���� !!!");
//            }
//            
//            // ���α׷� ���� ����
//            System.out.println("��� �����Ͻðڽ��ϱ�? y/n");
//            String yn = sc.next();
//            if (yn.equals("y") || yn.equals("Y")) {
//                System.out.println(">> ��� �����ϰڽ��ϴ�.");
//                continue;
//            } else if (yn.equals("n") || yn.equals("N")) {
//                System.out.println("���α׷��� �����մϴ�");
//                System.exit(0);
//            } else {
//                System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ��� !!!");
//                yn = sc.next();
//            }
//        }
		
	}	//main

}	//class
