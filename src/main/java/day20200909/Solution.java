package day20200909;
/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 
示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

 */




import java.util.HashMap;
import java.util.Map;

public class Solution {

    public  static  int[] twoSum(int[] nums, int target) {
        int [] z=new int[2];
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int var=target-num;
            if (map.containsKey(num)){
                z[0]=map.get(num);
                z[1]=i;

            }else {
                map.put(var,i);
            }
        }
        return z;


    }

    public static void main(String[] args) {
        int [] nums={2,7,11,15,78,97};
        int target=99;
        int[] ints = twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

