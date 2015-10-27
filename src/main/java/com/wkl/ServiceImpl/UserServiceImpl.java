package com.wkl.ServiceImpl;

import com.wkl.Dao.UserDao;
import com.wkl.Model.UserModel;
import com.wkl.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wklmogujie on 15/10/26.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String userLogin(UserModel user) {
        String password = userDao.userLogin(user);
        if (password.equals(user.getPassword())) {
            return "success";
        } else {
            return "false";
        }
    }

}
