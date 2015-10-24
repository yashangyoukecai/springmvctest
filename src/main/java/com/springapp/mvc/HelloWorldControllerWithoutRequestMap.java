package com.springapp.mvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * Created by wklmogujie on 15/10/24.
 */
public class HelloWorldControllerWithoutRequestMap implements Controller {
    private String supportedMethods;

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        if(!supportedMethods.equals("POST")) {
            //1、收集参数、验证参数
            //2、绑定参数到命令对象
            //3、将命令对象传入业务对象进行业务处理
            //4、选择下一个页面
            ModelAndView mv = new ModelAndView();
            //添加模型数据 可以是任意的POJO对象
            mv.addObject("message", "error method!");
            //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
            mv.setViewName("error");
            return mv;
        }

        //1、收集参数、验证参数
        //2、绑定参数到命令对象
        //3、将命令对象传入业务对象进行业务处理
        //4、选择下一个页面
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", "Hello World (RequestMapping)!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("helloOld");
        return mv;
    }

    public void setSupportedMethods(String supportedMethods) {
        this.supportedMethods = supportedMethods;
    }
}
