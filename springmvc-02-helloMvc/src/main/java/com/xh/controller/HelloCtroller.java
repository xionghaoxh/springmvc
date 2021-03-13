package com.xh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

public class HelloCtroller implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        ModelAndView mv = new ModelAndView();
        String result = "helloSpringMvc";
        mv.addObject("msg",result);
        //这里将传过去的视图名字到viewResolver去拼接 最后成 /WEB-INF/jsp/hello.jsp
        mv.setViewName("hello");
        return mv;
    }
}
