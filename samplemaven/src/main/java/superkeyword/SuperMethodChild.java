package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void display2()
	{
		super.display();
		System.out.println("this is the child class");
	}

	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.display2();

	}

}
