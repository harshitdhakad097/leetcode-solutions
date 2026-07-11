class Solution {
    //index of the pivot element is the index where the sum of all the numbers
    //  strictly to the left of the index is equal to the sum of all the numbers
    //  strictly to the right of the index.
    // using brute force approach we can find the pivot index by calculating
    //  the left sum and right sum for each index and checking if they are equal.
    //just iterate through the array and for each index calculate the left sum and right sum and check if they are equal.
    public int pivotIndex(int[] nums) {
     for(int i=0;i<nums.length;i++){
        int leftsum=0;
        int rightsum =0;
        for(int j=0;j<i;j++){
            leftsum= leftsum+nums[j];
        }
        for(int j=i+1;j<nums.length;j++){
            rightsum=rightsum+nums[j];
        }
        if(leftsum==rightsum){
            return i;
        }
     }   
     return -1;
    }
}