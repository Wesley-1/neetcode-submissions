class Solution {
    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> res = new ArrayList();

        res.add(List.of(1)); // Base case.

        for (int i = 1; i < numRows; i++) {
            List<Integer> lst = new ArrayList();
            lst.add(1);

            List<Integer> prev = res.get(i - 1);

            for (int j = 1; j < i; j++)
                lst.add(prev.get(j - 1) + prev.get(j));
            
            lst.add(1);

            res.add(lst);
        }

        return res;
    }
}