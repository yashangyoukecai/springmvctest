package com.wkl.Controllers;

import com.wkl.Model.UserModel;
import com.wkl.Service.UserService;
import com.wkl.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by wklmogujie on 15/10/26.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @Resource
    private UserValidator validator;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    protected String handle(UserModel user, BindingResult result, Model model) {
//        String flag = userService.userLogin(user);
//        if ("success".equals(flag)) {
//            Map<String, String> map = new HashMap<String, String>();
//            map.put("name", user.getName());
//            map.put("password", user.getPassword());
//            return new ModelAndView("success", map);
//            return "success";
//        }
        this.validator.validate(user, result);//添加验证
        if (result.hasErrors()) {
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.addObject("user", user);// 把user对象返回到页面， 这样不至于表单被清空了
//            modelAndView.setViewName("index");
//            return modelAndView;
            model.addAttribute("user", user);
            return "index";
        }

        String flag = userService.userLogin(user);
        if ("success".equals(flag)) {
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.setViewName("success");
//            return modelAndView;
              return "success";
        }
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error");
//        return modelAndView;
        model.addAttribute("message", "error password");
        return "error";
    }

}