package superkeyword;

public class SuperVarChild extends SuperVarEx {
	
	String color="red";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		SuperVarChild obj=new SuperVarChild();
		obj.display();

	}

}
