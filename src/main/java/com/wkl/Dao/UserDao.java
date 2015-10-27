package com.wkl.Dao;

import com.wkl.Model.UserModel;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by wklmogujie on 15/10/26.
 */
public interface UserDao {

    String userLogin(UserModel user);

}