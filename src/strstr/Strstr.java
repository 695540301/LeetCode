package strstr;



public class Strstr 
{
	public static void main(String[]args)
	{
		System.out.println(strStr("",""));
	}
	   public static int strStr(String haystack, String needle) 
	   {
		   if(null==needle||"".equals(needle))
		   {
			   return 0;
		   }
		   
		   int haystackLength =haystack.length();
		   int needleLength = needle.length();
		   int index =-1;
		   
		   for(int i =0;i<haystackLength;++i)
		   {
			   int k =i;
			   for(int j =0;j<needleLength;++j)
			   {
				   if(i<haystackLength&&haystack.charAt(i)==needle.charAt(j))
				   {
					   ++i;
				   }
			   }
			   if(k+needleLength==i)
			   {
				   return k;
			   }
			   i=k;
		   }
		   
	        return index;
	    }

}
