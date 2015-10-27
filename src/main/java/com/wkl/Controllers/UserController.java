package com.wkl.Controllers;

import com.wkl.Model.UserModel;
import com.wkl.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wklmogujie on 15/10/26.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    protected String handle(UserModel user, BindingResult result, ModelAndView modelAndView) {
        String flag = userService.userLogin(user);
        if ("success".equals(flag)) {
//            Map<String, String> map = new HashMap<String, String>();
//            map.put("name", user.getName());
//            map.put("password", user.getPassword());
//            return new ModelAndView("success", map);
            return "success";
        }
        return "fail";
    }

}