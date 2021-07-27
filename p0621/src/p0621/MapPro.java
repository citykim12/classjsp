package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class MapPro {
	
	public HashMap selectPro(ArrayList<Student> list, String input) {
		//teachers answer
		HashMap map = new HashMap();
		StringBuffer nameAll = new StringBuffer();
		StringBuffer nameResult = new StringBuffer();
		String result = "이름이 검색되지 않았습니다.";
		String resultCode = "fail";
		// 넘어온 데이터 1개씩 비교
		for(Student s:list) {
			nameAll.append(s.getName()+" ");
			if(s.getName().contains(input)) {
				result = "이름이 검색되었습니다.";
				resultCode = "success";
				nameResult.append(s.getName() + " ");
			}
		}
		map.put("nameAll", nameAll.toString());
		map.put("result", result);
		map.put("resultCode", resultCode);
		map.put("nameResult", nameResult);
		map.put("searchName", input);
		
		return map;
		
		//me answer
//		HashMap map = new HashMap();
//		StringBuffer sbf = new StringBuffer("");
//		String name = "";
//		String resultTitle = "fail";
//		int result=0; //0: 데이터가 없음, 1:데이터가 있음
//		
//		for(Student s:list){
//			sbf.append(s.getName() + " ");
//			if(s.getName().equals("홍길동")) {
//				result = 1;
//				resultTitle = "success";
//				name = "홍길동";
//			}
//		}
//		return map;
		
	}

}
