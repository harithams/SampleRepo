package inheritance_example;

public class Singlechild extends SingleParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singlechild obj=new Singlechild();
		obj.display();
		obj.display2();

	}
	public void display2()
	{
		System.out.println("single inheritance child class");
	}
	

}
