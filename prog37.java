class Dog1
{
	private String name;
	private String color;
	private int cost;
	
	public Dog1()
	{
		
	}
	public Dog1(String name)
	{
		super();
        this.name=name;
	}
	public Dog1(String name,String color)
	{
		super();
		this.name=name;
		this.color=color;
	}
	public Dog1(String name, String color, int cost) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	
	
}
public class prog37
{
	public static void main(String[] args)
	{
	Dog1 d1=new Dog1();
	
	System.out.println(d1.getName()); //null
	System.out.println(d1.getColor()); //null
	System.out.println(d1.getCost());  //0
	System.out.println("------------------------------------------------");
	
	
	Dog1 d2=new Dog1("rocky"); 
	System.out.println(d2.getName()); //rocky 
	System.out.println(d2.getColor());  //null
	System.out.println(d2.getCost());  //0
	System.out.println("------------------------------------------------");
	
	
	
	Dog1 d3=new Dog1("tommy","black");
	System.out.println(d3.getName()); //tommy
	System.out.println(d3.getColor()); //black
	System.out.println(d3.getCost());  //0
	System.out.println("------------------------------------------------");
	
	
	Dog1 d4=new Dog1("johny","white",5000);
	System.out.println(d4.getName());  //johny
	System.out.println(d4.getColor());  //white
	System.out.println(d4.getCost());   //5000
	
	/*null
null
0
------------------------------------------------
rocky
null
0
------------------------------------------------
tommy
black
0
------------------------------------------------
johny
white
5000*/
	
	
		
	}

}
