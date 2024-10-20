package inheritance_example;

public class HierarchialChild2 extends HierarchialParentClass {

	public static void main(String[] args) {
		HierarchialChild2 obj1=new HierarchialChild2();
		obj1.display2();
		obj1.display();

	}
	public void display2()
	
	{
		System.out.println("this is the second child");
	}

}
