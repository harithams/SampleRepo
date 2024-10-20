package inheritance_example;

public class HierarchialChild1 extends HierarchialParentClass {

	public static void main(String[] args) {
		HierarchialChild1 obj=new HierarchialChild1();
		obj.display1();
		obj.display();

	}
	public void display1()
	{
		System.out.println("this is one child class");
	}

}
