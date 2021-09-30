package com.itheima.text3;
/*@ClassName：Article
@date：2021/9/30 16:05
@作者：李磊
@Version：1.0
@Description：

*/

public abstract class Article {

    public void write(){
        System.out.println("《我的爸爸》");
        Body();
        System.out.println("啊！这就是我的爸爸！");
    }

    public abstract void Body();
}
