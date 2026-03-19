public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        int count = findLast(arr, target) - findFirst(arr, target) + 1;
        System.out.println("Count: " + (count > 0 ? count : 0));
    }
    static int findFirst(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] >= x) {
                if (arr[m] == x) ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
    static int findLast(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] <= x) {
                if (arr[m] == x) ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}
