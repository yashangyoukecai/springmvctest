package com.wkl.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wklmogujie on 15/10/26.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/helloWorld")
    public String helloworld() {
//         return "success"; //跳转到success页面
        return "index";
    }

}
