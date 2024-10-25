package accessmodifiers;

public class AccessModifierEx1 {
	public void display1()
	{
		System.out.println("this is the public access modifier");
	}
	private void display2()
	{
		System.out.println("this is the protected access modifier");
	}
	protected void display3()
	{
		System.out.println("this is the protected access modifier");
	}
	void display4()
	{
		System.out.println("this is the default access modifier");
	}
	

	public static void main(String[] args) {
		AccessModifierEx1 obj1=new AccessModifierEx1();
		obj1.display1();
		obj1.display2();
		obj1.display3();
		obj1.display4();

	}

}
