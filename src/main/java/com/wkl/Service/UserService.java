package com.wkl.Service;

import com.wkl.Model.UserModel;
import org.springframework.stereotype.Service;

/**
 * Created by wklmogujie on 15/10/26.
 */
public interface UserService {

    String userLogin(UserModel user);

}