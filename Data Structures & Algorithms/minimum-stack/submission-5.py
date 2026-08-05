class MinStack:
    # 0 as our top
    # val as our min
    # min - top = val (popping)
    # push(val) 
    # val - min 
    def __init__(self):
        self.stack = []
        self.minimum = float('inf')

    def push(self, val: int) -> None:
        if not self.stack:
            self.stack.append(0)
            self.minimum = val
        else:
            self.stack.append(self.key(val))
            self.minimum = min(self.minimum, val)

    def pop(self) -> None:
        key = self.stack.pop()

        if key < 0:
            self.minimum -= key

    def top(self) -> int:
        top = self.stack[-1]
        return top + self.minimum if top > 0 else self.minimum

    def key(self, val: int):
        return val - self.minimum
        
    def getMin(self) -> int:
        return self.minimum
        
