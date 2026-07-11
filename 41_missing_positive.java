class Solution {
// 1. Rearrange the array using Cyclic Sort.
// 2. Only numbers in the range [1, n] are placed.
// 3. Ignore numbers <= 0 and > n because they have no valid position.
// 4. After sorting, if nums[i] != i + 1, then i + 1 is the first missing positive.
// 5. If every position is correct, the answer is n + 1.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
    
    public int firstMissingPositive(int[] nums) {
    sort(nums);
   for(int i=0;i<nums.length;i++){
    if(nums[i]!=i+1){
        return i+1;
    }
   }
   return nums.length+1;
    }
    static void sort(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] > 0 &&
                nums[i] <= nums.length &&
                nums[i] != nums[correct]){
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