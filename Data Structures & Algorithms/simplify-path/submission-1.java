/**
 * So we have subsections now so "/neetcode/practice//...///../courses"
 */

class Solution {
    public String simplifyPath(String path) {
       Stack<String> stack = new Stack();
       String[] paths = path.split("/");

       for (String str : paths) {
            if (str.equals("..") && !stack.isEmpty()) stack.pop();
            else if (!str.equals("") && !str.equals(".") && !str.equals("..")) stack.push(str);
       }

       return "/" + String.join("/", stack);
    }
}