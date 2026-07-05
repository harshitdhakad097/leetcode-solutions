class Solution {
    // 1. Sort the array using cyclic sort
    // 2. Traverse the array and check if the value at index i is equal to i+1.
    //  If not, then the value at index i is the duplicate number and i+1 is the missing number.    
    public int[] findErrorNums(int[] nums) {
       int[] ans = new int[2];
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
           ans[0]=nums[i];
           ans[1]=i+1;
            }
        }
return ans;
        
    }
    static void sort(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
               
            }else{
                i++;
            }
        }
    }
    static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}