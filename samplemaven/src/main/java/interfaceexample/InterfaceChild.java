package interfaceexample;

public class InterfaceChild implements InterfaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj= new InterfaceChild();
		obj.display();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

}
