class TimeMap:
    # So every timestamp has a map. 
    def __init__(self):
        self.store = {}
    
    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.store:
            self.store[key] = []
        self.store[key].append([value, timestamp])

    def get(self, key: str, timestamp: int) -> str:
        result = ""
        values = self.store.get(key, [])

        left = 0
        right = len(values) - 1

        while left <= right:
            mid = (right + left) // 2
            val = values[mid]

            if val[1] <= timestamp:
                result = val[0]
                left = mid + 1
            else:
                right = mid - 1

        return result
