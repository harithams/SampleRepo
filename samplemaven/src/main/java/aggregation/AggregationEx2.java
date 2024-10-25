package aggregation;

public class AggregationEx2 {
	int rollno;
	String city;
	 AggregationEx1 obj;//aggregation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationEx1 object=new AggregationEx1("haritha",23);
		AggregationEx2 object1=new AggregationEx2(01,"kollam",object);
		object1.display();
		
	}
	public AggregationEx2(int rollno,String city,AggregationEx1 obj)
	{
		this.rollno=rollno;
		this.city=city;
		this.obj=obj;
		
	}
	public void display()
	{
		System.out.println(obj.name+obj.age);
		System.out.println(rollno+city);
	}

}
