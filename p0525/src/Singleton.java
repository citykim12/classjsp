
public class Singleton {
	
	private static Singleton s = new Singleton();
	static int count;
	private int stu_num;
	private String name;
	
	{
		count++;
		stu_num = count;
	}
	
	private Singleton() {}	// �⺻������
	
	public static Singleton getInstance() {
//		if(s==null) { //�޸𸮿� ���� �� ���Ӱ� �����ؼ� ����
//			s = new Singleton(); // �޸𸮿� ���� ��츸 if�� ����Ѵ�.
//		}
		return s;
	}

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
