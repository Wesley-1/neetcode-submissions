class Solution {
    public String longestCommonPrefix(String[] strs) {
        int left = 0;

        StringBuilder max = new StringBuilder();
        
        while (true) {
            
            if (left >= strs[0].length()) break;

            char prev = strs[0].charAt(left);
            for (int i = 1; i < strs.length; i++) {
                final String str = strs[i];

                if (left >= str.length()) return max.toString();

                if (prev == str.charAt(left)) continue;
                
                return max.toString();
            }

            max.append(prev);

            left++;
        }

        
        return max.toString();
    }
}