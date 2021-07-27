
public class Ex0513_03 {
	
	public static void main(String[] args) {
		
				
		//배열[3][3] = 0-9까지 랜덤 숫자를 넣어서 출력 
		// teacher answer
		int[] ball = new int[9];
		for(int i=0;i<ball.length;i++) {
			ball[i] = i;
		}

		int temp=0;
		int rno=0;
		for(int i=0;i<50;i++) {
			rno = (int)(Math.random()*9); //0-8
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
		}


		int[][] arr = new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=ball[3*i+j];  //0-9
				// 0,1,2,3,4,5,6,7,8 
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// me answer
//		int[] ball = new int[9];
//		
//		for(int i=0; i<9; i++) {
//			ball[i] = i;
//		}
//		
//		int temp = 0;
//		for(int i=0; i<9; i++) {
//			int num = (int)(Math.random()*10);
//			temp = ball[0];
//			ball[0] = ball[num];
//			ball[num] = temp;
//		}
////		System.out.println("로또 번호");
////		for(int i=0; i<9; i++) {
////			System.out.print(ball[i]+" ");
////		}
//		// teachers answer
//		int[][] arr = new int[3][3];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = ball[3*i+j]; //0-9
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		//me answer
//		int[][] arr = new int[3][3];
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = (int)(Math.random()*10)+1;
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//		}System.out.println();

		
		// int 7개 배열에 1-10까지 랜덤숫자를 넣어서 출력
		// 1. 배열 7, 랜덤숫자, 생성-넣기, 출력
	
		//teacher answer
		//1. 배열생성
//		int[] arr = new int[7];
//		//2. 랜덤숫자 생성해서 넣기
//		for(int i=0; i<7; i++) {
//			arr[i] = (int)(Math.random()*10)+1; //1-10
//		}
//		System.out.println("배열값: \t");
		
		
		
		// me answer
//		int[] num = new int[7];
//		
//		for(int i=0; i<num.length; i++) {
//			num[i] = i+1;
//			
//		}
//		int temp = 0;
//		for(int  i=0; i<num.length; i++) {
//			int rnum = (int)(Math.random()*45);
//			temp = num[0];
//			num[0] = num[rnum];
//			num[rnum] = temp;
//		}
//		System.out.println("랜덤번호");
//		for(int i=0; i<7; i++) {
//			System.out.println(num[i] + " ");
//		}
//		System.out.println();
//		
	} // main

} // class
