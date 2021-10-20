package text5;

/*
  @ClassName：Demo5
  @date：2021/10/8 13:58
  @author: 李磊
  @Version：1.0
  @Description：
 */

public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int min = 0,num=20,index=-1, max = arr.length - 1, mid = (max + min) >> 1;
        while (min<=max) {
            if(num==arr[mid]){
                index=mid;
                break;
            }else if (num>arr[mid]){
                min=mid+1;
                mid=(min+max)>>1;
            }else {
                max=mid-1;
                mid=(min+max)>>1;
            }
        }
        System.out.println(index);


    }
}
