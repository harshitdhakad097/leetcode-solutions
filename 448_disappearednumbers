class Solution {
    // This function finds all the numbers that are missing
    //  from the array 'nums' which contains numbers in the range 
    // [1, n], where n is the size of the array. The function first sorts 
    // the array using a cyclic sort algorithm, and then it checks for any indices 
    // where the value does not match the expected value (i + 1). If a mismatch is found,
    //  it adds the expected value to the result list.
    public List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
           List<Integer> ans = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
         } 
         return ans;
    }
    static void sort(int[] nums){
        int i=0;
         while(i<nums.length){
            int correct= nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);

            }else{
                i++;
            }
         }
      
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}