
public class Ex0615_004 {

	public static void main(String[] args) throws Exception {
			method1();
		
	}	//main
	static void method1() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		try {
			throw new Exception(); //���Ƿ� ���� �߻�
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//		try {
//			startInstall();
//			copyFiles();
////			deleteTempFiles(); // ���������� ����� �� ��� �� try���� catch ���� �� �� ������ finally�� ����� ��� �����ϴ� 
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			deleteTempFiles();
//		}
	
//	static void startInstall() {
//		
//	}
//	static void copyFiles() {}
//	static void deleteTempFiles() {}
	
}	//class
