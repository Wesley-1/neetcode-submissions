class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        final Stack<Integer> stack = new Stack();

        for (int roid : asteroids) {
            int sign = roid & (1 << 31);
            int size = Math.abs(roid);

            while (!stack.isEmpty() && roid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                int sign2 = top & (1 << 31);
                int size2 = Math.abs(top);

                if (sign2 == sign) break;
                
                if (size == size2) { 
                    stack.pop();
                    roid = 0;
                } else if (size2 > size) {
                    roid = 0;
                } else {
                    stack.pop();
                }
            }

            if (roid != 0) {
                stack.push(roid);
            }
        }

        int[] res = new int[stack.size()];

        int c = stack.size() - 1;
        while (!stack.isEmpty()) res[c--] = stack.pop();

        return res;
    }
}