class ugly {
    public int isUgly(int n) {
        if(n==1)return s;
        int s=0;
        
        for(int i=1;i<n;i++)
        {
            if((n%2==0||n%3==0||n%5==0))
                s=0;
            else if(n%i==0 &&((i!=2||i!=3||i!=5)))
                s++;
        }
        if(s>0) return s;
        else return s;

    }
	public static void main(String [] args)
	{
		isUgly(21);
	}
}