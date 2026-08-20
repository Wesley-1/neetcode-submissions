class Solution {
    public int countElements(int[] arr) {
        final Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return Arrays.stream(arr).boxed().filter(element -> set.contains(element + 1)).collect(Collectors.toList()).size();
    }
}
