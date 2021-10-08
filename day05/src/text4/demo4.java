package text4;
/*@ClassName：demo4
@date：2021/10/8 11:29
@作者：李磊
@Version：1.0
@Description：

*/

public class demo4 {
    public static void main(String[] args) {
        String ss = "125,267,85,60,99,100";
        String[] split = ss.split(",");
        int[] num = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            num[i] = Integer.parseInt(split[i]);
        }
        for (int j : num) {
            System.out.println(j);
        }
    }
}
