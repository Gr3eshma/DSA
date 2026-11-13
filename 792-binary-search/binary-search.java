class Solution {
    public int search(int[] nums, int target) {
        int r, l, mid;
        l = 0;
        r = nums.length - 1;

        while (l <= r) { // Changed '<' to '<='
            mid = l + (r - l) / 2;

            if (nums[mid] > target) {
                r = mid - 1; // Target is in the left half, so move 'r'
            } else if (nums[mid] < target) {
                l = mid + 1; // Target is in the right half, so move 'l'
            } else {
                return mid;
            }
        }
        return -1;
    }
}
