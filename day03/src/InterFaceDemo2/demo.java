package InterFaceDemo2;
/*@ClassName：demo
@date：2021/10/6 11:44
@作者：李磊
@Version：1.0
@Description：
1. 支付宝和美团都有卡包功能，支付宝的卡包有优惠券和车票，美团的卡包只有优惠券
2. 定义一个接口Function，在里面定义抽象方法card()，代表卡包功能
3. 在接口Function定义一个默认方法scan()，实现扫码功能，实现类对象可直接使用
4. 美团有骑车功能，请在接口Function中定义合适的方法
5. 定义一个美团类Meituan实现该接口，重写相应方法
6. 在测试类中创建美团类对象，分别调用扫码和骑车功能
*/

public class demo {
    public static void main(String[] args) {
        Meituan meituan = new Meituan();
        meituan.card();
        meituan.cycling();
    }
}
