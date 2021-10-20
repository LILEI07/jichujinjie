package text6;

import java.util.Arrays;

/**
 * @ClassName：demo06_1
 * @Date：2021/10/8
 * @Time: 19:19
 * @Author: 李磊
 * @Version：1.0
 * @Description： 冒泡排序
 */
//开始用的是异或的方法，一直都没问题，结果在进行快速排序的时候，用异或交换数据，
// 导致其中一个数据直接归零了，查了之后才了解到，变量在异或的时候如果地址相同那么结果就是0（主要是指针重合了），
    //所以，没办法只能用第三方变量中转一下，但是下午的这个选择排序用异或就很方便，Ctrl+d，很快，可以偷懒……偷懒使人进步！！
public class demo06_1 {
    public static void main(String[] args) {
        int[] arr = {22, 6, 3, 8, 33, 75, 25, 32, 0, 25, 33, 42, 66, 82, 23};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
