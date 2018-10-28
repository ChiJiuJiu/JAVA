import java.util.ArrayList;
import java.util.List;

public class Solution {

public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        	return "";
		int i = 0,k = 0;
        int mark = 0;
        int cnt = 0;
        char c;
        int minLen = strs[0].length();
        List<Character> s = new ArrayList<Character>();
        for(i = 0; i < strs.length; i++) {
        	if(minLen > strs[i].length())
        		minLen = strs[i].length();
        }
        for(i = 0; i < minLen; i++) {
        	c = strs[0].charAt(i);
        	for(k = 0;k < strs.length; k++) {
        		if(c == strs[k].charAt(i)) {
        			continue;
        		}
        		else {
					mark = 1;
					break;
				}
        	}
        	if(mark == 0)
        		cnt++;
        	else
        		break;
        }
        return strs[0].substring(0, cnt);
    }
	
	public static void main(String[] ars){
		String[] s = {"dog","flower","cat"};
		System.out.println(longestCommonPrefix(s));
	}
}
