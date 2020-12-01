package services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import DAO.userDAO;
import model.UserDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class validate
{

    public boolean loginControl(String lemail, String lpwd)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("data.xml");
        userDAO customerDAO = (userDAO) context.getBean("userDAO");
        UserDetails u=customerDAO.search(lemail);


//        System.out.println(lemail+" "+lpwd);
        try{
        if(u.getUserpwd().equals(lpwd))return true;
        return false;

    }catch (Exception e){
            return false;

        }
    }

    public void registercontrol( String rName,String rEmail, String rPwd,String rNumber)

    {
        ApplicationContext context = new ClassPathXmlApplicationContext("data.xml");
        userDAO customerDAO = (userDAO) context.getBean("userDAO");
        UserDetails customer = new UserDetails(rName, rEmail, rPwd,rNumber);
//		System.out.println("register ck"+ customer.getName()+" "+customer.getEmail()+" "+customer.getPass());
        customerDAO.userRegistration(customer);




    }

}
