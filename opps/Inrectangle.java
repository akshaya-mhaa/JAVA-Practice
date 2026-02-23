class Inrectangle extends Inshape
{
	int l;
	int b;
	Inrectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	@Override
	public void getarea(int l,int b)
	{
		System.out.println("ARea is:"+(l*b));
		
	}
}
