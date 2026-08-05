class Solution {
    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack();
        final char[] arr = s.toCharArray();

        final Map<Character, Character> closingMap = new HashMap();

        closingMap.put(')', '(');
        closingMap.put('}', '{');
        closingMap.put(']', '[');

        for (char c : arr) {
            final boolean empty = stack.isEmpty();

            if (!empty && closingMap.containsKey(c)) {
                final Character element = stack.peek();

                if (closingMap.get(c) == element) {
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
