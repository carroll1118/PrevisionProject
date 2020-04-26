package study1117;

class ToolUtil{
	//1.必须在该类中创建一个对象出来
	private static ToolUtil instance = new ToolUtil();
	//2.私有化自己的构造器，防止外界通过构造器来创建新的对象
	private ToolUtil() {}
	//3.给外界提供一个方法，能够获取已经创建好的对象
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
