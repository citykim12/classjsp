
public class Ex0514_01 {

	public static void main(String[] args) {
		// 1���� 30��¥�� �迭 �����ؼ� �������� 1~100���� ���ڸ� �ְ�
		// 1���� 40��¥�� �迭 �����ؼ� �迭 5��°����� 20���� ����
		// for��, arraycopy�޼ҵ� 2������ ��� ���
		
		int[] num = new int[30];
		int[] newNum = new int[40];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		
		// for�� �迭����
		for(int i=4; i<24; i++) { //0,1,2,3,4
			newNum[i] = num[i];
		}
		
		//arraycopy�޼ҵ� �迭����
		System.arraycopy(num, 4, newNum, 0, 20);
		
		//���
		for(int i=0; i<newNum.length; i++) {
			System.out.println(newNum[i]);
		}
		
//		int temp = 0;
//		int rnum = 0;
//		temp = num[0];
//		num[0] = num[rnum];
//		num[rnum] = temp;
		
//		int[] num = {1,2,3,4,5};
//		int[] newNum = new int[10];
		
		//System.arraycopy() �޼ҵ� ����ؼ� �迭 ����
//		System.arraycopy(num, 0, newNum, 0, num.length);
		
		
		//for���� ����� �迭 ����
//		for(int i=0; i<num.length; i++) {
//			newNum[i] = num[i];
//		}
		
		
//		for(int i=0; i<newNum.length; i++) {
//			System.out.println(newNum[i]);
//		}

	} //main

} //class
