package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class MapProcess {
	
	public HashMap selectStudent(ArrayList<Student> list) {
		
		HashMap map = new HashMap();
		StringBuffer sbf = new StringBuffer("");
		String name = "";
		String resultTitle = "����";
		int result=0; //0: �����Ͱ� ����, 1:�����Ͱ� ����
		
		for(Student s:list){
			sbf.append(s.getName() + " ");
			if(s.getName().equals("ȫ�浿")) {
				result = 1;
				resultTitle = "�����Ͱ� �ֽ��ϴ�.";
				name = "ȫ�浿";
			}
		}
		
		String strName = sbf.toString();
		map.put("strName", strName);
		map.put("result", result);
		map.put("resultTitle", resultTitle);
		map.put("name", name);
		
		return map;
	}
}
