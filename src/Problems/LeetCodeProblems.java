package Problems;

import java.util.Arrays;

public class LeetCodeProblems {
	public static void main(String[] args) {
		//https://leetcode.com/problems/running-sum-of-1d-array/
		//runningSome(new int[] {1,2,3,4}); runningSome(new int[] {1,1,1,1,1});
		
		//https://leetcode.com/problems/find-pivot-index
		findPivotIndex(new int[] {1,7,3,6,5,6}); findPivotIndex(new int[] {1,2,3});findPivotIndex(new int[] {2,1,-1});
	}

	private static int leftIndexSum(int[] ary,int index) {
		int sum=0;
		for(int i=0;i<index;i++) {
			sum=sum+ary[i];
		}
		return sum;
	}
	private static int rightIndexSum(int[] ary,int index) {
		int sum=0;
		for(int i=index+1;i<ary.length;i++) {
			sum=sum+ary[i];
		}
		return sum;
	}
	private static void findPivotIndex(int[] nums) {
		boolean found=false;
		for(int i=0;i<nums.length;i++) {
			int sumLeft =leftIndexSum(nums,i);
			int sumRight=rightIndexSum(nums,i);
			if(sumLeft==sumRight)
			{
				System.out.println(i+" "+sumLeft+"  "+sumRight);
				found=true;
			}
		}
		if(!found)
			System.out.println(-1);
	}

	private static void runningSome(int[] nums) {
		int [] sumAry=new int[nums.length];
		for(int i=0;i<sumAry.length;i++) {
			int x=0;
			for(int j=0;j<i+1;j++) {
				x=x+nums[j];
			}
			sumAry[i]=x;
		}
		System.out.println(Arrays.toString(sumAry));
	}
}
