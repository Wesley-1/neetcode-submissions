class Solution {
    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack();
        final char[] arr = s.toCharArray();

        final Map<Character, Character> closingMap = new HashMap();

        closingMap.put(')', '(');
        closingMap.put('}', '{');
        closingMap.put(']', '[');

        for (char c : arr) {
            if (!stack.isEmpty() && closingMap.containsKey(c)) {
                if (closingMap.get(c) == stack.peek()) stack.pop();
                else return false;
            } else stack.push(c);
        }

        return stack.isEmpty();
    }
}
