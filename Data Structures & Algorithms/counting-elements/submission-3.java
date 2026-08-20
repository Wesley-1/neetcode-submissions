class Solution {
    public int countElements(int[] arr) {
        final Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return (int) Arrays.stream(arr).filter(element -> set.contains(element + 1)).count();
    }
}
