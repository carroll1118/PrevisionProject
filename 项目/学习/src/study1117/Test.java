package study1117;

class ToolUtil{
	//1.�����ڸ����д���һ���������
	private static ToolUtil instance = new ToolUtil();
	//2.˽�л��Լ��Ĺ���������ֹ���ͨ���������������µĶ���
	private ToolUtil() {}
	//3.������ṩһ���������ܹ���ȡ�Ѿ������õĶ���
	static public ToolUtil getInstance() {
		return instance;	
	}
	public void show() {
	
		
	}
	
}



public class Test {

	public static void main(String[] args) {

		
		ToolUtil tool1 =	ToolUtil.getInstance();	
		tool1.show();
		ToolUtil tool2 =    ToolUtil.getInstance();
		tool2.show();
		System.out.println(tool1);
		System.out.println(tool2);

	}
}
