class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        heap = []
        freqs = {}

        for n in nums:
            freqs[n] = 1 + freqs.get(n, 0)
        
        for value, freq in freqs.items():
            heapq.heappush(heap, (freq, value))
            if len(heap) > k:
                heapq.heappop(heap)

        res = [y for x, y in heap]
        
        return res