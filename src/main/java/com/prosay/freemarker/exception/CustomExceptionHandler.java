package com.prosay.freemarker.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex) {
        ModelAndView mv = new ModelAndView();
        String message = ex.getMessage();
        System.out.println("异常mes:" + message);
        mv.addObject("message", message);
        mv.setViewName("error/error");
        return mv;
    }
}
