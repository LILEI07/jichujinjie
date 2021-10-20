package text8;

import java.util.Arrays;

/**
 * @ClassName：demo8
 * @Date：2021/10/8
 * @Time: 16:31
 * @Author: 李磊
 * @Version：1.0
 * @Description：快速排序
 */

public class demo8 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        qucksrot(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void qucksrot(int[] arr, int left, int right) {

        if (left > right) {
            return;
        }
        int left0 = left;
        int right0 = right;
        int basenum = arr[left];

        while (left != right) {
            while (arr[right] >= basenum && left < right) {
                right--;

            }
            while (arr[left] <= basenum && left < right) {
                left++;
            }

/*          arr[left] = arr[left] ^ arr[right];
            arr[right] = arr[left] ^ arr[right];
            arr[left] = arr[left] ^ arr[right];*/
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }
/*      arr[left0] = arr[left0] ^ arr[left];
        arr[left] = arr[left0] ^ arr[left];
        arr[left0] = arr[left0] ^ arr[left];*/
        int temp = arr[left0];
        arr[left0] = arr[left];
        arr[left] = temp;

        qucksrot(arr, left0, left - 1);
        qucksrot(arr, left + 1, right0);
    }

}

