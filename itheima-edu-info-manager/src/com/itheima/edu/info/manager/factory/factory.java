package com.itheima.edu.info.manager.factory;
/*@ClassName：factory
@date：2021/10/6 16:48
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;

public class factory {
    public static BaseStudentDao getStudentdao() {
          return new OtherStudentDao();
        //return new StudentDao();
    }
}
