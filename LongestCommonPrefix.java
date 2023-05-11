class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
        return "";
    }
    
    // Assume the first string is the common prefix
    String prefix = strs[0];
    
    // Iterate through the array of strings
    for (int i = 1; i < strs.length; i++) {
        // While the current string does not start with the prefix,
        // remove the last character from the prefix and try again
        while (!strs[i].startsWith(prefix)) {
            prefix = prefix.substring(0, prefix.length() - 1);
            
            // If the prefix becomes empty, there is no common prefix
            if (prefix.isEmpty()) {
                return "";
            }
        }
    }
    
    return prefix;
    }
}
