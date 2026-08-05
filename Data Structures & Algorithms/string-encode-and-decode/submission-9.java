class Solution {

    public String encode(List<String> strs) {
        final StringBuilder builder = new StringBuilder();

        for (String str : strs) {
            final int len = str.length();
            builder.append(len).append("#").append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {        
        final List<String> lst = new ArrayList();
        System.out.println(str);

        int i = 0;
        while (i < str.length()) {
            int j = i;
            
            while (str.charAt(j) != '#')
                j++;
            
            final int value = Integer.parseInt(str.substring(i, j));

            i = j + 1;
            j = i + value;

            final String parsed = str.substring(i, j);
            lst.add(parsed);

            i = j; 
        }

        return lst;
    }
}
