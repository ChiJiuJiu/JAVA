
public class divide {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0) return Integer.MAX_VALUE;
        if(divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
          long pDividend = Math.abs((long)dividend);//ȡ����ֵ�������ת��Ϊlong
          long pDivisor = Math.abs((long)divisor);
          
         int result = 0;
         while(pDividend >= pDivisor)
         {
             int count = 0;//��¼λ��
             while(pDividend >= (pDivisor << count))
             {
                 count ++;
             }
             result += (1 << (count-1));
             pDividend -= (pDivisor << (count-1));
         }
         if((dividend <0 && divisor < 0) || (dividend > 0 && divisor > 0))
         {
             return result;
         }
         else
         {
             return -result;
         }
    }
}