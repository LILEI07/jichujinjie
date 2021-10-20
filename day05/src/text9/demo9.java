package text9;

import java.util.Arrays;

/**
 * @ClassName：demo9
 * @Date：2021/10/8
 * @Time: 18:44
 * @Author: 李磊
 * @Version：1.0
 * @Description：选择排序
 */

public class demo9 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
