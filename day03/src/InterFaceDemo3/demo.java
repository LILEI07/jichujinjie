package InterFaceDemo3;
/*@ClassName：demo
@date：2021/10/6 14:21
@作者：李磊
@Version：1.0
@Description：

*/

public class demo {
    public static void main(String[] args) {
        InterImp interImp = new InterImp();
        interImp.start();
        interImp.end();
        StactInterFace.staticeat();
        StactInterFace.staticdk();
    }

}

class InterImp implements StactInterFace {

}
