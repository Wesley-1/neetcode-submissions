/**
 * So we have subsections now so "/neetcode/practice//...///../courses"
 */

class Solution {
    public String simplifyPath(String path) {
        final String[] subsections = path.split("/");
        final Stack<String> finalOutput = new Stack();


        for (String sub : subsections) {
            if (sub.isEmpty()) continue;
            if (sub.equals(".")) continue;
            if (sub.equals("..")) {
                if (!finalOutput.isEmpty()) finalOutput.pop();
                continue;
            }

            finalOutput.push(sub);
        }

        return "/" + String.join("/", finalOutput.stream().toList());
    }
}