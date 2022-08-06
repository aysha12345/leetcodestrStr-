class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        if(needle.equals("")) {
            return 0;
        }
        
        if(haystackLength < needleLength) {
            return -1;
        }
        
        for(int i = 0; i < haystackLength - needleLength + 1; i ++) {
            if(haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
