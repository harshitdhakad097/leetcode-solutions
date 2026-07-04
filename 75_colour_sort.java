class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int mid =0;
        int end = nums.length-1;
        int temp;
        while(start<=end&&mid<=end){
            if (nums[mid]==0){
             temp=nums[start];
             nums[start]=nums[mid];
             nums[mid]=temp;
             mid++;
             start++;
                
            }else if(nums[mid]==2){
            temp=nums[end];
             nums[end]=nums[mid];
             nums[mid]=temp;
            
             end--;
                
            }else{
                mid++;
            }
                
            
        }
    }
}