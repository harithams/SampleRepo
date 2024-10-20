package inheritance_example;

public class MultiLevelChildC extends MultiLevelParentB {

	public static void main(String[] args) {
		MultiLevelChildC obj=new MultiLevelChildC();
		obj.display();
		obj.display2();
		obj.Display3();

	}
	public void Display3()
	{
		System.out.println("this is the child class");
	}

}
