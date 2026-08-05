class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        // Max width = 16
        // This is an len = 8
        // Example of text # len = 14
        // justification. # len = 14
        
        final List<String> lines = new ArrayList();
        final List<String> list = new LinkedList();
        list.addAll(List.of(words));

        while (list.size() > 0) {
            int currentWidth = 0;
            List<StringBuilder> line = new ArrayList();

            while (currentWidth < maxWidth && list.size() > 0) {
                final String element = list.get(0);
                
                if (line.size() + element.length() + currentWidth <= maxWidth) {
                    line.add(new StringBuilder(element));
                    currentWidth += element.length();
                    list.remove(0);
                } else {
                    break;
                }
            }

            int remaining = maxWidth - currentWidth;
            while (remaining > 0 && list.size() != 0) {
                for (int i = 0; i < line.size(); i++) {
                    final StringBuilder builder = line.get(i);

                    if (remaining == 0) break;

                    if (i + 1 != line.size() || line.size() == 1) {
                        builder.append(" ");
                        remaining--;
                    } 
                }
            }
            
            StringBuilder finalLine = new StringBuilder();

            for (StringBuilder builder : line) {
                final String str = builder.toString();
                finalLine.append(str);
            }

            if (list.size() == 0) {
                lines.add(String.join(" ", line) + " ".repeat(remaining - line.size() + 1));
                break;
            }

            lines.add(finalLine.toString());
        }
        return lines;
    }
}