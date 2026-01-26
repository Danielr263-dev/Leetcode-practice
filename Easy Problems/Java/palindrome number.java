class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
            //neg #'s cannot be palindromes due to the - symbol
        }

        int rev = 0;//for reversing the #
        int num = x;//for holding the #

        while(num != 0)
        {
            rev = rev * 10 + num % 10; //adds the last digit
            num = num / 10; //removes the last digit

            /*in each iter:
            num % 10 gets the last digit of the number.
            multiply rev by 10 and add the last digit -> effectively builds the reversed number.
            divide num by 10 to remove the last digit.
            */
        }

        return (rev == x);
        //returns either true or false 
    }
}