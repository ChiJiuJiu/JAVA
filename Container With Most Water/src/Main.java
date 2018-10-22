<<<<<<< HEAD

public class Main {
	public static int min(int m,int n) {
		return(m < n ? m : n);
	}
	public static void main(String[] args) {
		int []height = {1,8,6,2,5,4,8,3,7};
		System.out.println(Solution.maxArea(height));

	}

}
class Solution {
    public static int maxArea(int[] height) {
        int maxarea = 0;
        int len = 0;
        int area = 0;
        int high = 0;
        int i,j;
        for(i = 0; i<height.length - 1; i++) {
        	for(j = i + 1; j<height.length; j++) {
        		high = Main.min(height[i], height[j]);
        		len = j - i;
        		area = high * len;
        		if(area > maxarea)
        			maxarea = area;
        	}
        }
        return maxarea;
    }
=======

public class Main {
	public static int min(int m,int n) {
		return(m < n ? m : n);
	}
	public static void main(String[] args) {
		int []height = {1,8,6,2,5,4,8,3,7};
		System.out.println(Solution.maxArea(height));

	}

}
class Solution {
    public static int maxArea(int[] height) {
        int maxarea = 0;
        int len = 0;
        int area = 0;
        int high = 0;
        int i,j;
        for(i = 0; i<height.length - 1; i++) {
        	for(j = i + 1; j<height.length; j++) {
        		high = Main.min(height[i], height[j]);
        		len = j - i;
        		area = high * len;
        		if(area > maxarea)
        			maxarea = area;
        	}
        }
        return maxarea;
    }
>>>>>>> a8a83698f7e43fa083c63e8090a315f562686894
}