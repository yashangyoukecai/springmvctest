package com.springapp.mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wklmogujie on 15/10/24.
 */
public class HelloCache extends AbstractController{
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {

        //点击后再次请求当前页面
        resp.getWriter().write("<a href=''>this</a>");
        return null;
    }
}
