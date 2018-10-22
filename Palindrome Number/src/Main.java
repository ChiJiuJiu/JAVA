<<<<<<< HEAD

public class Main {

	public static void main(String[] args) {
		System.out.println(Solution.isPalindrome(121));
		
	}

}

class Solution {
    public static boolean isPalindrome(int x) {
    	if( x < 0)
    		return false;
    	int last = 0;
    	int num = x;
    	int mol = 0;
    	int reverNum = 0;
    	int len = lenOfNum(x);
    	while(len > 0) {
    		last = getLastNum(num);
    		mol = (int)Math.pow(10, len - 1);
    		reverNum += last * mol;
    		num /= 10;
    		len--;
    	}
    	return (reverNum == x);
    }
    public static int getLastNum(int x) {
    	return x % 10;
    }
    public static int lenOfNum(int x) {
    	int len = 0;
    	if(x == 0)
    		return 1;
    	while(x > 0) {
    		len++;
    		x /= 10;
    	}
    	return len;
    }
=======

public class Main {

	public static void main(String[] args) {
		System.out.println(Solution.isPalindrome(121));
		
	}

}

class Solution {
    public static boolean isPalindrome(int x) {
    	if( x < 0)
    		return false;
    	int last = 0;
    	int num = x;
    	int mol = 0;
    	int reverNum = 0;
    	int len = lenOfNum(x);
    	while(len > 0) {
    		last = getLastNum(num);
    		mol = (int)Math.pow(10, len - 1);
    		reverNum += last * mol;
    		num /= 10;
    		len--;
    	}
    	return (reverNum == x);
    }
    public static int getLastNum(int x) {
    	return x % 10;
    }
    public static int lenOfNum(int x) {
    	int len = 0;
    	if(x == 0)
    		return 1;
    	while(x > 0) {
    		len++;
    		x /= 10;
    	}
    	return len;
    }
>>>>>>> a8a83698f7e43fa083c63e8090a315f562686894
}