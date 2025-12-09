/*Given an integer x, return true if x is a palindrome, and false otherwise.*/
/*Input: x = 121
Output: true */


class Palindrome {
   public boolean isPalindrome(int x) 
   {
    int temp = x , sum = 0 ;
    while (temp >0)
    {
        int rem =temp % 10;
        sum = sum *10 + rem ;
        temp = temp /10 ;
    }
    if (sum == x)
        return true; 
    else
        return false ;
    }
}
