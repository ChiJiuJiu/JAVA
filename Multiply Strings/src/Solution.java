
public class Solution {
public static String multiply(String num1, String num2) {
		String t = "";
		if(num1.length() < num2.length()) {
			t = num1;
			num1 = num2;
			num2 = t;
		}
		int len1 = num1.length();
        int len2 = num2.length();
        int add = 0;
        int cnt = 0;
        int len = len1 + len2;
        char[] ret  = new char[len];
        for(int i = 0; i<len ;i++)
        	ret[i] = '0';
        int i = 0,j = 0;
        int temp = 0;
        int Tret = 0;
        int Tpresum = 0;
        for(i = len2 - 1; i>=0; i-- ) {
        	for(j = len1 - 1; j >= 0; j--) {
        		temp = (num1.charAt(j) - '0')*(num2.charAt(i) - '0');
        		Tpresum = (ret[len - 1 - cnt + (j - len1 + 1)] - '0');
        		Tret = ((add + Tpresum + temp) % 10);
        		ret[len - 1 - cnt + (j - len1 + 1)] = (Tret + "").charAt(0);
        		add = (add + Tpresum + temp) / 10;
        	}
        	if(add > 0) {
        		Tpresum = (ret[len - 1 - cnt + (j - len1 + 1)] - '0');
    		    Tret = ((add + Tpresum) % 10);
        		ret[len - 1 - cnt + (j - len1 + 1)] = (Tret + "").charAt(0);
        		add = (Tpresum) / 10;
        	}
        	cnt++;
        	
        }
        String s = "";
        int mark = 0;
        for(char x : ret) {
        	if(x != '0')
        		mark = 1;
        	if(mark == 1)
        		s += x;
        }
        if(mark == 0)
        	return 0+"";
        return s.trim();
    }
	public static void main(String[] args) {
		System.out.println(Solution.multiply("999", "999"));
		
	}

}
