package com.wkl.DaoImpl;

import com.wkl.Dao.UserDao;
import com.wkl.Model.UserModel;
import org.springframework.stereotype.Service;

/**
 * Created by wklmogujie on 15/10/26.
 */
@Service
public class UserJdbcDaoImpl implements UserDao {

    @Override
    public String userLogin(UserModel user) {
        return "123456";
    }
}
