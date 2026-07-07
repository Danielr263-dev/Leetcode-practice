
class Solution {
    public int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length())
            return -1;
        //no need to even consider a haystack smaller than the needle

        for(int i = 0; i <= haystack.length() - needle.length(); i++)
        {
            /*haystack.length - needle.length is the size as since you're comparing slices, that result number is the only max # of comparisons you can do with the slices */

            if(haystack.substring(i, i+needle.length()).equals(needle))
                return i;
                /*if the substring from i to len of needle + i (so that the substring updates accordingly each iter), equals what the needle is (as a word), then return i, which is where the word that matches needle exactly starts*/
        }

        return -1;
    }
}