
class Dog
{
	private String name;
	private String color;
	private int cost;

	void setdata(String a,String b,int c)
	{
		name=a;
		color=b;
		cost=c;
	}
	void getdata()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}

}
public class prog34 {
	public static void main(String[] args) {

		Dog d1=new Dog();
		//d1.name="tommy";   	error can't access private variables
		//d1.color="black";		error can't access private variables
		//d1.cost=6000;			error can't access private variables
		d1.setdata("tommy","black",5000);
		d1.getdata();
	}
}
