package com.webapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import services.validate;
@Controller
public class reg
{
    @RequestMapping("/register")
    public ModelAndView register(HttpServletRequest request , HttpServletResponse response)
    {
        String rName=request.getParameter("rname");
        String rEmail=request.getParameter("remail");
        String rPwd=request.getParameter("rpwd");
        String rNumber=request.getParameter("rnumber");


        ModelAndView mv=new ModelAndView();
        //System.out.println(rName+" "+rEmail+" "+rPwd+" "+rNumber);
        validate v=new validate();
        v.registercontrol(rName,rEmail,rPwd,rNumber);




        mv.setViewName("register.jsp");

        return mv;



    }
    @RequestMapping("/login")
    public ModelAndView login( HttpServletRequest request, HttpServletResponse response)
    {
        String lemail=request.getParameter("lemail");
        String lpwd =request.getParameter("lpwd");
        ModelAndView mv  = new ModelAndView();


        validate v =new validate();
        if (v.loginControl(lemail,lpwd)){
            mv.setViewName("sucess.jsp");
        }
        else {
            mv.setViewName("errorlogin.jsp");
        }
        return mv;
    }


}
