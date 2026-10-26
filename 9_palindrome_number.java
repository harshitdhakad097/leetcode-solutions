class Solution {
    public boolean isPalindrome(int x) {
        // we will reverse the number and check if the reversed number is equal to the original number or not.
        
       int orignal=x;
       int digit,rev;
              rev=0;
               
        if (x<0){
            return false;
        }

    while(x!=0){
       digit=x%10;
       rev=rev*10+digit;
       x=x/10;
       }
       
       if (orignal==rev){
            return true;
        }
        return false;
    }
}