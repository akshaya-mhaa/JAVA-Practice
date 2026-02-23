class NoOfWord
{
	public static void main(String[] args) 
	{
		String s="    jsdsdcj Vel tech   High Tech   ";
		int count=0;
		s.trim();
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==' '&&(s.charAt(i+1)>='a'||s.charAt(i+1)>='z'||s.charAt(i+1)>='A'||s.charAt(i+1)>='Z'))
				count++;
		}
		if(s.charAt(0)>='a'||s.charAt(0)>='z'||s.charAt(0)>='A'||s.charAt(0)>='Z')
			count++;
	
		System.out.print(count);
	}
}
