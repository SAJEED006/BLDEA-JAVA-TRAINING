
class Dogy
{
	private String name;
	private String color;
	private int cost;

	void setdata(String a,String b,int c)
	{
		this.name=a;
		this.color=b;
		this.cost=c;
	}
	void getdata()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}

}
public class prog36 {
	public static void main(String[] args) {

		Dogy d1=new Dogy();
		//d1.name="tommy";   	error can't access private variables
		//d1.color="black";		error can't access private variables
		//d1.cost=6000;			error can't access private variables
		d1.setdata("tommy","black",5000);
		d1.getdata();
	}
}
