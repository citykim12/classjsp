import java.util.Scanner;

public class Ex0518_02 {

   public static void main(String[] args) {
      //학생 5명 선언
      Scanner scan = new Scanner(System.in);
      
      //객체 배열 선언
      Student[] s = new Student[3];

      //3명의 학생의 성적입력
      for(int i=0; i<s.length; i++) {
         //데이터 저장을 위한 객체선언
         s[i] = new Student();
         
         System.out.println("이름을 입력하세요");
         s[i].name = scan.next();
         for(int j=0; j<s[0].score.length; j++) {
            //점수 입력(국어, 영어 , 수학, 3개
            System.out.println("점수를 입력하세요");
            s[i].score[j] = scan.nextInt();
            
            s[i].total = s[i].score[0]+s[i].score[1]+s[i].score[2];
            s[i].avg = s[i].total/3.0;
         }
         
      }
      // 3명 학생 출력
      for(int i=0; i<s.length; i++) {
          //데이터 저장을 위한 객체선언
          System.out.print(s[i].stu_number+"\t");
          System.out.print(s[i].name+"\t");
          //점수 출력(국어, 영어 , 수학, 3개)
          for(int j=0; j<s[0].score.length; j++) {
             System.out.print(s[i].score[j] + "\t");
          }
          System.out.print(s[i].total+"\t");
          System.out.print(s[i].avg+"\n");
       }
       
      //System.out.println("영어점수를 입력하세요");
      //s[0].eng = scan.nextInt();
      //System.out.println("수학점수를 입력하세요");
      //s[0].math = scan.nextInt();
   }

}