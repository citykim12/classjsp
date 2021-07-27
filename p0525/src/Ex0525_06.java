import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex0525_06 {

	public static void main(String[] args) {
		// Calendar ��ü ���
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Calendar cal = Calendar.getInstance();
		String today3 = sdf3.format(cal.getTime());
		System.out.println("Calendar ��ü �ð�: " + today3);
		
		//Date ��ü ��� - ��¥�� �ð��� ����.
		Date time = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf1.format(time);
		System.out.println("Date ��ü �ð�: " + today);
		
		Date time2 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String today2 = sdf2.format(time2);
		System.out.println("Date ��ü2 �ð�: " + today2);
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
//		Singleton s = new Singleton();
//
//		s.setName("hong gildong");
//		System.out.println("�й�: " + s.getStu_num());
//		System.out.println("�й�: " + s.getName());
		
	}//main
	
}//class
