package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class MapPro {
	
	public HashMap selectPro(ArrayList<Student> list, String input) {
		//teachers answer
		HashMap map = new HashMap();
		StringBuffer nameAll = new StringBuffer();
		StringBuffer nameResult = new StringBuffer();
		String result = "�̸��� �˻����� �ʾҽ��ϴ�.";
		String resultCode = "fail";
		// �Ѿ�� ������ 1���� ��
		for(Student s:list) {
			nameAll.append(s.getName()+" ");
			if(s.getName().contains(input)) {
				result = "�̸��� �˻��Ǿ����ϴ�.";
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
//		int result=0; //0: �����Ͱ� ����, 1:�����Ͱ� ����
//		
//		for(Student s:list){
//			sbf.append(s.getName() + " ");
//			if(s.getName().equals("ȫ�浿")) {
//				result = 1;
//				resultTitle = "success";
//				name = "ȫ�浿";
//			}
//		}
//		return map;
		
	}

}
