class Solution {
    public double myPow(double x, int n) {
        double pow=1.0;
        double p=1.0;
        if(x==1)
            return 1;
        if(n==1)
            return x;
        if(n>1)
        {
            for(int i=0;i<=n-1;i++)
            {
                pow=x*pow;
            }
        
        }
        else if(n<0)
        {
          for(int i=0;i<=-n-1;i++)
            {
                p=x*p;
            } 
            pow=1/p; 
        }
        return pow;
    }
}