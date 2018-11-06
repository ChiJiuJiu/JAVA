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
        if (target < 0) return; //���·��ֵС��0��������������Ϊ����Ȩֵ���Ǵ����㣬��һ���ﵽ����û�а취�ٻص�0
        if (target == 0) { //���Ŀ��Ϊ0����·��Ȩֵ���Ѿ���Ϊtarget�����������������·���������
            res.add(new ArrayList<>(list)); //
            return;
        }
        for (int p = i; p < nums.length; p++) { 
            list.add(nums[p]); //��ӽڵ㵽·��
            get(nums, p, target - nums[p], list, res); //������·�������ϼ������Ҹ���Ȩֵ����·������Ϊ���Ի������Ի��Ǵ�����ڵ㿪ʼ����
            list.remove(list.size() - 1); //���ӵ�ǰ�ڵ������·����������Ϻ󣬽����޳���֮��������������һ���ڵ㿪ʼ������·��
        }
    }
	public static void main(String[] args) {
		int a[] = {2,3,6,7};
		System.out.println(combinationSum(a, 7));

	}

}
