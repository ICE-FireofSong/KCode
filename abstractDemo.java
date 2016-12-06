class  abstractDemo
{
	public static void main(String[] args) 
	{
		Programmer a= new Programmer("张三","ID9557",2132.23);
		a.work();
		System.out.print(a.getName());
		Manager b = new Manager("李四","ID9558",3133,2131);
		System.out.print(b.getBouns());
		}
}

abstract class Employee
{	private String name;
	private  String id;
	private	double pay;
   Employee (String name,String id,double pay)
	{
         this.name=name;
		 this.id = id;
		 this.pay=pay;
	}
 public  String getName()
{
		return name;
}
 public  String getId()
{
		return id;
}
 public double getPay()
{
		return pay;
}
	public abstract void work();
}

class Programmer extends Employee
{	
	Programmer(String name,String id,double pay)
	{
		super(name,id,pay);
	}
	public void work()
	{
		System.out.print("好好作");
	}
}
class Manager extends Employee
{	 private double bouns;
Manager(String name,String id,double pay,double bouns)
{	super(name,id,pay);
	this.bouns=bouns;
}
	public  double getBouns()
{
		return bouns;
}
    public void work()
{
	System.out.print("干员");
}
}

