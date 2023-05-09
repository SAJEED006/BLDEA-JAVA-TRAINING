class Tiger
{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
public class prog35 {
	public static void main(String[] args) {
		
	
	Tiger t1=new Tiger();
	t1.setName("blacky");
	t1.setColor("orange");
	t1.setCost(500);
	t1.setAge(6);
	t1.setCountry("india");
	
	System.out.println(t1.getName());
    System.out.println(t1.getColor());
    System.out.println(t1.getCost());
    System.out.println(t1.getAge());
    System.out.println(t1.getCountry());
    
    

}
}