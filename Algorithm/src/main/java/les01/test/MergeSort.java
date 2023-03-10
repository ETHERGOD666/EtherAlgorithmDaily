package les01.test;

/**
 * @author 樊金亮
 * @date 2023/2/13
 */
public class MergeSort {
    public static void process(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + (r - l) / 2;
        process(arr, l, mid);
        process(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;

        while (p1 <= mid && p2 <= r) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }

        while (p2 <= r) {
            help[i++] = arr[p2++];
        }

        for (i = 0; i < help.length; i++) {
            arr[l + 1] = help[i];
        }
    }
}
