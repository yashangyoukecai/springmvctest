package com.wkl.ServiceDao;

import com.wkl.Dao.UserDao;
import com.wkl.Model.UserModel;

/**
 * Created by wklmogujie on 15/10/26.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public String userLogin(UserModel user) {
        return "123456";
    }
}
