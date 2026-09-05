class Solution {
    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack();
        final Map<Character, Character> closeToOpen = new HashMap();
        
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && closeToOpen.containsKey(c)) {
                if (closeToOpen.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
