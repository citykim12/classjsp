
public class Ex0615_004 {

	public static void main(String[] args) throws Exception {
			method1();
		
	}	//main
	static void method1() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		try {
			throw new Exception(); //고의로 예외 발생
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//		try {
//			startInstall();
//			copyFiles();
////			deleteTempFiles(); // 공통적으로 사용할 때 사용 → try문과 catch 문에 둘 다 있으면 finally를 만들어 사용 가능하다 
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
