import java.util.HashMap;

public class Substring {

	public static void main(String[] args) {
		System.out.println(Solution.longestPalindrome("cbbd"));

	}

}
class Solution {
    public static String longestPalindrome(String s) {
        HashMap<Integer , String> list = new HashMap<Integer,String>();
        int max = 0;
    	if(s.length() <= 1)
        	return s;
        int i = 0,j = 0,k = 0;
        int cnt = 0;
        for(i = 0; i < s.length(); i++) {
        	for(j = s.length(); j > i; j--) {
        		String sub = s.substring(i, j);
        		for(k = 0; k < sub.length(); k++) {
        			if(sub.charAt(k) == sub.charAt(sub.length() - k - 1))
        				cnt++;
        		}
        		if(cnt == sub.length()) {
        			list.put(sub.length(), sub);
        			if(sub.length() > max)
        				max = sub.length();
        		}
        		cnt = 0;
        	}
        }
        if(list.isEmpty())
        	return "";
        else return list.get(max);
    }
}