package p0616;

import java.util.Random;
import java.util.Scanner;

public class Ex0616_07 {

	public static void main(String[] args) {
		//복권 1조12345 → 0-9까지 가능 
		// 마지막 자리 → 1천원
		// 마지막 2자리 → 1만원
		// 마지막 3자리 → 10만원
		// 마지막 4자리 → 100만원
		// 마지막 5자리 → 1000만원
		// 1번째로 랜덤으로 숫자를 생성해서 1조12345 복권번호를 생성해보세요.
		
		//데이터를 입력받아 숫자가 몇개 맞는지를 출력하시오.
		// 1조95494 → 3조96694 → 몇개 맞는지
		// 내가 입력한 데이터 : 1조95494
		// 당첨된 복권 데이터 : 3조96694
		// 3개가 당첨되었습니다.
		
		//당첨번호 int 배열
		int[] inputNum = new int[6];
		//표시 배열
		char[] ch = new char[6];
		
		//복권번호입력
		Scanner scan = new Scanner(System.in);
		System.out.println("복권 번호를 입력하세요 → (ex: 1조12345)");
		String input = scan.next();	//1조01234
		//int 배열에 담기
		for(int i=0;i<inputNum.length;i++) {
			if(i==0) {
				inputNum[i] = input.charAt(i)-'0';	//1| |01234
			}else if(i==1) continue;
			else {	//2,3,4,5,6
				inputNum[i-1] = input.charAt(i)-'0';	//101234
			}
		}
		
		//복권 당첨번호 생성
		int[] num = new int[6];
		for(int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*10);
		}
		
		//당첨개수 확인
		int count = 0;
		for(int i=0;i<num.length;i++) {
			if(inputNum[i]==num[i]) {
				ch[i]='O';
				count++;
			}else {
				ch[i] = 'X';
			}
		}
		
		//입력번호 출력
		System.out.println(inputNum[0]+"조"+inputNum[1]+inputNum[2]+inputNum[3]+inputNum[4]+inputNum[5]);
		
		//복권 당첨번호 출력
		System.out.println(num[0]+"조"+num[1]+num[2]+num[3]+num[4]+num[5]);
		System.out.println("---------------------------");
		System.out.println(ch[0]+"조"+ch[1]+ch[2]+ch[3]+ch[4]+ch[5]);
		System.out.println("당첨 갯수: " + count);
		
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
//				System.out.println("to input 6 numbers → ");
//				mynum[j] = scan.nextLine();
//				System.out.println(mynum[j]);
//			}
//			
//			
//			if(num.equals(mynum)) {
//				System.out.println("모두 맞췄습니다! 1등 당첨!");
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
//				System.out.println("숫자를 입력하세요 → ");
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
//		System.out.println(num1+"조"+num2+num3+num4+num5+num6);
		
		
		//me answer
//		int lotto[] = new int[5];
//		
//		int count = 0;
//		for(int j=0;j<9;j++) {
//			count = (int)(Math.random()*9);
//			count++;
//			for(int i=0;i<200;i++) {
//				lotto[i] = (int)(Math.random()*1000);
//				System.out.println(count + "조" + lotto[i]);
//				lotto[i]++;
//			}
//		}
		
		//구글링 로또프로그램
//        System.out.println(">> 로또 프로그램  ");
//        while (true) {
// 
//            System.out.println("숫자 6개를 입력해 주세요");
//            int arr[] = new int[6];
//            Scanner sc = new Scanner(System.in);
// 
//            for (int i = 0; i < 6; i++) {
//                arr[i] = sc.nextInt();
//                if (arr[i] > 0 && arr[i] <= 65) {
//                } else {
//                    System.out.println("범위를 넘었습니다.");
//                    i--;
//                }
//                for (int j = 0; j < i; j++) {
//                    if (arr[i] == arr[j]) { // 중복 확인
//                        System.out.println("중복입니다.");
//                        i--;
//                    }
//                    if (arr[i] < arr[j]) { // 오름 차순 정리
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//            System.out.print("당신이 입력한 숫자는 : ");
//            for (int i = 0; i < 6; i++) {
//                System.out.print(arr[i] + " ");
//            }
// 
//            // 컴퓨터 난수 생성
//            Random ram = new Random();
//            int comarr[] = new int[6];
//            for (int i = 0; i < 6; i++) {
//                comarr[i] = ram.nextInt(65) + 1;
//                for (int j = 0; j < i; j++) {
//                    if (comarr[i] == comarr[j]) {
//                        i--; // 중복 일시 난수 제거
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
//            System.out.print("로또 당첨 번호는 : ");
//            for (int i = 0; i < 6; i++) {
//                System.out.print(comarr[i] + " ");
//            }
// 
//            // 사용자가 입력한 숫자와 컴퓨터의 난수 비교
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
//                System.out.println("꼴등 !!!");
//            } else if (cont == 1) {
//                System.out.println("6등 !!!");
//            } else if (cont == 2) {
//                System.out.println("5등 !!!");
//            } else if (cont == 3) {
//                System.out.println("4등 !!!");
//            } else if (cont == 4) {
//                System.out.println("3등 !!!");
//            } else if (cont == 5) {
//                System.out.println("2등 !!!");
//            } else if (cont == 6) {
//                System.out.println("1등 !!!");
//            } else {
//                System.err.println("오류 !!!");
//            }
//            
//            // 프로그램 진행 여부
//            System.out.println("계속 진행하시겠습니까? y/n");
//            String yn = sc.next();
//            if (yn.equals("y") || yn.equals("Y")) {
//                System.out.println(">> 계속 진행하겠습니다.");
//                continue;
//            } else if (yn.equals("n") || yn.equals("N")) {
//                System.out.println("프로그램을 종료합니다");
//                System.exit(0);
//            } else {
//                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요 !!!");
//                yn = sc.next();
//            }
//        }
		
	}	//main

}	//class
