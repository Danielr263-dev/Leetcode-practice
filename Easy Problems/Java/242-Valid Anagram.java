class Solution {
    public boolean isAnagram(String s, String t) {
        //turn both strings into char arrays then sort arrays and compare

        char[] tony1 = s.toCharArray();
        char[] tony2 = t.toCharArray();
        Arrays.sort(tony1);
        Arrays.sort(tony2);

        boolean answer = Arrays.equals(tony1, tony2);
        return answer;
    }
}
