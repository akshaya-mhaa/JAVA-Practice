class ParentChild
{
	
	private String name;
	private int age;
	private long phonenumber;
	
	Parent(){
		
	}
	
	Parent( String name,int age,long phonenumber)
	{
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
	}
	
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public long getphonenumber()
	{
		return phonenumber;
	}
	public void setname(String n)
	{
		name=n;
	}
	public void setage(int a)
	{
		age=a;
	}
	public void setphonenumber(long p)
	{
		phonenumber=p;
	}
	

}
