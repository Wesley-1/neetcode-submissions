class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for token in tokens:
            try:
                stack.append(int(token))
                continue
            except:
                pass

            if len(stack) <= 1:
                continue

            a, b = stack.pop(), stack.pop()
            if token == '+':
                stack.append(a + b)
            elif token == '-':
                stack.append(b - a)
            elif token == '*':
                stack.append(a * b)
            elif token == '/':
                stack.append(int(b / a))
        return stack[0]
        
