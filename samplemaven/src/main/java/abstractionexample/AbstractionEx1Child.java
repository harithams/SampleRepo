package abstractionexample;

public class AbstractionEx1Child extends AbstractionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionEx1Child obj=new AbstractionEx1Child();
		obj.add();
		obj.display();
		obj.display1();

	}
	public void display1()
	{
		System.out.println("Astract child");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int sum=5+3;
		System.out.println(sum);
		
	}

}
