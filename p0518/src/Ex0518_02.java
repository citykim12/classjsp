import java.util.Scanner;

public class Ex0518_02 {

   public static void main(String[] args) {
      //�л� 5�� ����
      Scanner scan = new Scanner(System.in);
      
      //��ü �迭 ����
      Student[] s = new Student[3];

      //3���� �л��� �����Է�
      for(int i=0; i<s.length; i++) {
         //������ ������ ���� ��ü����
         s[i] = new Student();
         
         System.out.println("�̸��� �Է��ϼ���");
         s[i].name = scan.next();
         for(int j=0; j<s[0].score.length; j++) {
            //���� �Է�(����, ���� , ����, 3��
            System.out.println("������ �Է��ϼ���");
            s[i].score[j] = scan.nextInt();
            
            s[i].total = s[i].score[0]+s[i].score[1]+s[i].score[2];
            s[i].avg = s[i].total/3.0;
         }
         
      }
      // 3�� �л� ���
      for(int i=0; i<s.length; i++) {
          //������ ������ ���� ��ü����
          System.out.print(s[i].stu_number+"\t");
          System.out.print(s[i].name+"\t");
          //���� ���(����, ���� , ����, 3��)
          for(int j=0; j<s[0].score.length; j++) {
             System.out.print(s[i].score[j] + "\t");
          }
          System.out.print(s[i].total+"\t");
          System.out.print(s[i].avg+"\n");
       }
       
      //System.out.println("���������� �Է��ϼ���");
      //s[0].eng = scan.nextInt();
      //System.out.println("���������� �Է��ϼ���");
      //s[0].math = scan.nextInt();
   }

}