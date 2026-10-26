class Solution {
    public boolean isAnagram(String s, String t) {
        // Length must be equal
        if (s.length() != t.length()){
            return false;
        }
        // Convert the string to array of char
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        // use the sort function
        Arrays.sort(s1);
        Arrays.sort(s2);
        // then compare and validate
        return Arrays.equals(s1,s2);
    }
}
