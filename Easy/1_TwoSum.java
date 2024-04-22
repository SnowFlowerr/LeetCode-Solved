package Easy;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []res={0,0};
        HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                res[0]=map.get(nums[i]);
                res[1]=i;
                break;
            }
            int comp=target-nums[i];
            map.put(comp,i);
        }
        return res;
    }
}