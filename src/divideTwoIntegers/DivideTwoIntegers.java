package divideTwoIntegers;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
		Solution solution = divideTwoIntegers.new Solution();

		System.out.println(solution.divide(-1, 1));

	}

	class Solution {
		public int divide(int dividend, int divisor) 
		{
		
		  //判断除数是否为0，为0则结果是极大值
          if(divisor==0)
          {
        	  return Integer.MAX_VALUE;
          }
          
     
          //判断结果是否是负数
          boolean isNegative = false;
          if((dividend>0&&divisor<0)||(dividend<0&&divisor>0))
          {
        	  isNegative = true;
        	  
          }
          
          long dividendLong = Math.abs((long)dividend);
          long divisorLong =Math.abs((long)divisor);
          if(dividend==0||dividendLong<divisorLong)
          {
        	  return 0;
          }
          
         long result =dichotomyDividend(dividendLong,divisorLong);
          
          if(result>Integer.MAX_VALUE)
          {
        	  return isNegative?Integer.MIN_VALUE:Integer.MAX_VALUE;
          }
		   return isNegative?(int)-result:(int)result;
		}

		private long dichotomyDividend(long dividendLong, long divisorLong) 
		{
			// TODO Auto-generated method stub
			if(dividendLong<divisorLong)
			{
			    return 0;
			}
			//首次取1值
			long result=1;
			long tempDivisor = divisorLong;
			
			//进行二分减少计算
			while(dividendLong>=(tempDivisor+tempDivisor))
			{
				tempDivisor+=tempDivisor;
				result+=result;
			}
			
			return result+dichotomyDividend(dividendLong-tempDivisor, divisorLong);
		}
	}

}
