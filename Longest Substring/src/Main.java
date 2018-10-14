
public class Main {

	public static void main(String[] args) {
		System.out.println(Solution.lengthOfLongestSubstring(""));
	}

}
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
		return 0;
	int max = 1,cnt = 1,PRO = 1;
	int i,j;
	int mark = 0;
	for(i = 0; i<s.length();i++){
		cnt = 1;
		if(max > PRO)
			PRO = max;
		max = 1;
		mark = 0;
		for(j = i+1; j<s.length();j++ ){
			for(int k = i;k<j;k++){
				if(s.charAt(k) == s.charAt(j)){
					mark = 1;
					break;
				}else 
					continue;
			}
			if(mark == 0){
				cnt++;
				if(cnt>max)
					max = cnt;
				continue;
			}else{
				max = cnt;
				cnt = 1;
				break;
			}
		}
	}return PRO;
    }
}
