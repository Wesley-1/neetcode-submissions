class Solution {
    public int numUniqueEmails(String[] emails) {
        
        final Set<String> unique = new HashSet();

        for (String str : emails) {
            final String[] parts = str.split("@");

            final String localName = parts[0];


            final String localNameReplaced = localName.split("\\+")[0].replace(".", "");

            final String address = parts[1];

            final String clean = localNameReplaced + "@" + address;
            
            unique.add(clean);
        }

        return unique.size();
    }
}