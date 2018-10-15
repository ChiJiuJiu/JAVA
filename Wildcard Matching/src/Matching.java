
public class Matching {

	public static void main(String[] args) {
	System.out.println(Solution.isMatch("aa", "a"));
	}

}
class Solution {
    public static boolean isMatch(String s, String p) {
        if(s == null && p == null)	return true;
    	int m = s.length();
        int n = p.length();
        if(m == 0 && n == 0)	return true;
        int si = 0, pi = 0;
        int xidx = -1, mtch = -1;
        while(si < m) {
        	if(pi < n && p.charAt(pi) == '*') {
        		xidx = pi++;
        		mtch = si;
        	}else if(pi < n && (s.charAt(si) == p.charAt(pi) || p.charAt(pi) == '?')) {
        		++pi;
        		++si;
        	}else if(xidx > -1) {
        		pi = xidx + 1;
        		si = ++mtch;
        	}else {
        		return false;
        	}
        }
     while(pi < n && p.charAt(pi) == '*') ++pi;
     return (pi == n);
    }
}