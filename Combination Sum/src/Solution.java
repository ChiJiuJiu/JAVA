import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        if(candidates == null)
        	return ret;
        List<Integer> list = new ArrayList<>();
        get(candidates, 0, target, list, ret);
        return ret;
        
    }
	public static void get(int[] nums, int i, int target, List<Integer> list, List<List<Integer>> res) {
        if (target < 0) return; //如果路径值小于0，搜索结束，因为所有权值都是大于零，即一旦达到负数没有办法再回到0
        if (target == 0) { //如果目标为0代表路径权值和已经满为target，满足条件，故添加路径到结果集
            res.add(new ArrayList<>(list)); //
            return;
        }
        for (int p = i; p < nums.length; p++) { 
            list.add(nums[p]); //添加节点到路径
            get(nums, p, target - nums[p], list, res); //在已有路径基础上继续查找更新权值后后的路径，因为有自环，所以还是从自身节点开始搜索
            list.remove(list.size() - 1); //当从当前节点的所有路径都搜索完毕后，将其剔除，之后重新搜索从下一个节点开始的所有路径
        }
    }
	public static void main(String[] args) {
		int a[] = {2,3,6,7};
		System.out.println(combinationSum(a, 7));

	}

}
